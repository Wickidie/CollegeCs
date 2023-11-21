<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://www.w3schools.com/w3css/4/w3.css" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
    <?php
        $servername = "localhost";
        $username = "root";
        $password = "Admin@123";
        $dbname = "codelab";

        // Create connection
        $conn = mysqli_connect($servername, $username, $password, $dbname);
        // Check connection
        if (!$conn) {
          die("Connection failed: " . mysqli_connect_error());
        }

        if (isset($_POST['userid']) && isset($_POST['passcode']) && isset($_POST['repasscode'])){
          if($_POST['userid'] != "" && $_POST['passcode'] != "" && $_POST['repasscode'] != ""){
              if($_POST['passcode'] == $_POST['repasscode']){
                $userid = $_POST['userid'];
                $passcode = $_POST['passcode'];

                $sql = "INSERT INTO users (userid, passcode, avatar)
                VALUES ('$userid', '$passcode', 'img_avatar1.png')";

                if (mysqli_query($conn, $sql)) {
                  echo "<div class='=w3-panel w3-pale-blue w3-leftbar w3-rightbar w3-border-blue'>";
                  echo "<h3> New record created successfully </h3>";
                  echo "<a href='connect.php'> <button class='w3-btn w3-green'> Back </button> </a>";
                  echo "</div>";
                  } else {
                  echo "Error: " . $sql . "<br>" . mysqli_error($conn);
                  }
                  mysqli_close($conn);
                }
              else{
                header('Location: connect.php');
            }
          }
        }
    ?>
</body>
</html>