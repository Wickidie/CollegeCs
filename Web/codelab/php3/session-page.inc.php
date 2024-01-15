<?php
  session_start();
  $userid = $_SESSION['userid'];

  if (isset($userid) && !empty($userid)) {
    echo "Hello $userid";
  }else{
    header('Location: users-login-form.php');
  }
?>