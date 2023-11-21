<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://www.w3schools.com/w3css/4/w3.css" rel="stylesheet"> 
</head>
<body>
    <div class="w3-container">
        <p><a href='User2.php'> <b> Characters </b></a>/Remove/ 
    <?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "db_test";
    
    $user = $_GET['userid'];
    
    // Create connection
    $conn = mysqli_connect($servername, $username, $password, $dbname);
    // Check connection
    if (!$conn) {
      die("Connection failed: " . mysqli_connect_error());
    }
    
    // sql to delete a record
    $sql = "DELETE FROM users WHERE userid='$user'";
    
    if (mysqli_query($conn, $sql)) {
        header('Location: User2.php');
    } else {
      echo "Error deleting record: " . mysqli_error($conn);
    }
    
    mysqli_close($conn);
    ?>
    </div>
</body>
</html>