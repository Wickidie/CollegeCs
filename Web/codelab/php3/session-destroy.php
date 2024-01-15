<?php
  session_start();
  session_destroy();
  header('Location: users-login-form.php');
  echo "Session has been destroyed.";
?>


  