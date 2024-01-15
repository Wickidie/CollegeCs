<?php
  include_once 'db-connect.inc.php';

  $userid = $_POST['userid'];
  $passcode = md5($_POST['passcode']);

  if (isset($userid) && isset($passcode)){
    if(!empty($userid) && !empty($passcode)){
      $sql = "SELECT * FROM users WHERE userid = '$userid' && passcode = '$passcode'";

      if (mysqli_num_rows(mysqli_query($conn, $sql)) > 0) {
        session_start();
        $_SESSION['userid'] = $userid;
        header('Location: users-list.php');
      } else {
        echo "Error: " . $sql . "<br>" . mysqli_error($conn);
        header('Location: users-login-form.php');
      }
    }else{
      echo "<h3> Failed to Create Record </h3>";
      header('Location: users-login-form.php');
    }
  }else{
    echo "<h3> Failed to Create Record </h3>";
    header('Location: users-login-form.php');
  }
  mysqli_close($conn);
?>