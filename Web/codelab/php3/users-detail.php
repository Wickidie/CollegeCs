<?php
  include_once 'db-connect.inc.php';
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Codelab PHP1</title>

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> 
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>

<body>
  <div>
    <a href="users-list.php">
      <button class="w3-button w3-green w3-section w3-padding">User List</button>
    </a>
  </div>
</body>

<?php
  $userid = $_GET['userid'];
  $sql = "SELECT * FROM users WHERE userid='$userid'";
  $result = mysqli_query($conn, $sql);
  $row = mysqli_fetch_assoc($result);

  echo "<div class='w3-card' style='width:50%'>";
  echo "<div class='w3-container'>";
  echo "<img src='https://www.w3schools.com/w3css/" . $row['avatar'] . "' style='width:50%>'";
  echo "<p>" . $row['userid'] . "</p>";
  echo "<p>" . $row['passcode'] . "</p>";
  echo "</div>";
  echo "</div><br/>";

  mysqli_close($conn);
?>

