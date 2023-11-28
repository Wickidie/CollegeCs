<?php
  include_once 'db-connect.inc.php';

  if (isset($_POST['userid']) && isset($_POST['passcode']) && isset($_POST['repasscode'])){
    if($_POST['userid'] != "" && $_POST['passcode'] != "" && $_POST['repasscode'] != ""){
      if($_POST['passcode'] == $_POST['repasscode']){
        $userid = $_POST['userid'];
        $passcode = md5($_POST['passcode']);

        $sql = "INSERT INTO users (userid, passcode, avatar)
        VALUES ('$userid', '$passcode', 'img_avatar1.png')";

        if (mysqli_query($conn, $sql)) {
          echo "ASDASDADASDASD";
          header('Location: users-register.php');
        } else {
          echo "Error: " . $sql . "<br>" . mysqli_error($conn);
        }
      } else {
        echo "<h3> Failed to Create Record </h3>";
        header('Location: users-register.php');
      }
    }
  }
  mysqli_close($conn);
?>