<?php
  $userid = $_SESSION['userid'];

  if (isset($userid) && !empty($userid)) {
    echo "$userid";
  }else{
    header('Location: users-login-form.php');
  }
?>