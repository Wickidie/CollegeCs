<?php
  include_once 'db-connect.inc.php';
?>

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

<?php
  $sql = "SELECT `userid`, `passcode`, `avatar` FROM `users` WHERE 1";
  $result = mysqli_query($conn, $sql);
  $result_row = mysqli_num_rows($result);
  $i = 0;

  if ($result_row > 0) {
    while ($row = mysqli_fetch_assoc($result)) {
      $i++;
      echo $i . " " . 
          $row['userid'] . " " .
          $row['passcode'] . " " .
          "<img src='https://www.w3schools.com/w3css/" . $row['avatar'] . 
          "'style='width:50px'></td>" .
          "<a href='users-delete.php?userid=" . $row['userid'] . "'><span class='material-symbols-outlined'>delete</span></a>" .
          "<a href='users-detail.php?userid=" . $row['userid'] . "'><span class='material-symbols-outlined'>change_circle</span></a>" .
          "<a href='users-update-form.php?userid=" . $row['userid'] . "'><span class='material-symbols-outlined'>change_circle</span></a>" .
          "<br>";
    }
  }
  mysqli_close($conn);
?>
