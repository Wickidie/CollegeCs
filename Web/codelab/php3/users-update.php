<?php
  include_once 'db-connect.inc.php';
  
  $old_userid = $_POST['old_userid'];
  $userid = $_POST['userid'];
  $passcode = $_POST['passcode'];
  $sql = "UPDATE users SET userid='$userid', passcode='$passcode' WHERE userid='$old_userid'";

  if (mysqli_query($conn, $sql)) {
    echo "Record updated successfully";
    echo $old_userid;
    echo $userid;
    echo $passcode;
    header('Location: users-list.php');
  } else {
    echo "Error updating record: " . mysqli_error($conn);
  }

  mysqli_close($conn);
?>