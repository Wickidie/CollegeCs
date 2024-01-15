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
    <div class="w3-container">
        <p><b> Characters </b></p>

    <div class="w3-row"><div class="w3-col s4 w3-center">
    <table class="w3-table-all w3-hoverable w3-stripped" id ="table">
        <thead>
            <tr class="w3-blue">
                <th>No.</th>
                <th> Avatar </th>
                <th> userid </th>
                <th> passcode </th>
                <th> Actions </th>
            </tr>
</thead>
    <?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "db_test";
    
    // Create connection
    $conn = mysqli_connect($servername, $username, $password, $dbname);
    // Check connection
    if (!$conn) {
      die("Connection failed: " . mysqli_connect_error());
    }
    
    $sql = "SELECT userid, passcode, avatar FROM users";
    $result = mysqli_query($conn, $sql);
    
    if (mysqli_num_rows($result) > 0) {
      // output data of each row
      $counter = 0;
      while($row = mysqli_fetch_assoc($result)) {
        $userid = $row["userid"];
        echo "<tr>";
        echo "<td style='vertical-align:middle'>" . $counter + 1 . "</td>";
        echo "<td style='vertical-align:middle'> <img src= 'https://www.w3schools.com/w3css/".$row["avatar"] . "'' class='w3-circle' alt='Person' style='width:50px'> </td>";
        echo "<td style='vertical-align:middle'>" . $userid . "</td>";
        echo "<td style='vertical-align:middle'>" . $row["passcode"] . "</td>";
        echo "<td style='vertical-align:middle'> <a href='detail_user2.php?user=".$counter."'>
        <i class ='material-icons'>folder_shared</i></a>&nbsp;
        <a href='users-remove.php?userid=".$userid."'>
        <i class='material-icons'>delete_forever</i></a> &nbsp;
        <i class ='material-icons'>
        </td>";
        echo "</tr>";
        $counter = $counter+1;
      }
    } else {
      echo "0 results";
    }
    mysqli_close($conn);

    if (isset($_POST['userid']) && isset($_POST['passcode'])){
        if($_POST['userid']!= "admin" || $_POST["passcode"]!= "admin"){
            header('Location: login2.php');
        }else{
            $session = 1;
        }
    }

    ?>
    </table>
    <p><b><button class="w3-button w3-light-blue" onclick="window.print()"> Print Report </button> </b> </p>
</div>
</div>
<p>
    <!-- sign out -->
    <div class="w3-row"><div class ="w3-col s4">
        <b> <a href="login2.php"> <button class="w3-button w3-red"> Sign out </button> </a> </b> </p>
    </div>
    <div class="w3-row"><div class ="w3-col s4">
        <b> <a href="connect.php"> <button class="w3-button w3-green"> Add User </button> </a> </b> </p>
    </div>
</div>


<!-- Tambahkan CHARACTER DETAILS DAN EDIT -->
</body>
</html>