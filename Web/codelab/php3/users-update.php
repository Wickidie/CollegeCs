<?php
  include_once 'db-connect.inc.php';
  include_once 'session-page.inc.php';

  
  $userid = $_POST['userid'];
  $passcode = $_POST['passcode'];
  $sql = "UPDATE users SET passcode='$passcode' WHERE userid='$userid'";

  if (mysqli_query($conn, $sql)) {
    echo "Record updated successfully";
    echo $userid;
    echo $passcode;
    header('Location: users-list.php');
  } else {
    echo "Error updating record: " . mysqli_error($conn);
  }

  mysqli_close($conn);
?>