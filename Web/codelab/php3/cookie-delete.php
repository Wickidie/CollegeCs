<?php
  setcookie("user", "", time() - 3600, "/");
  echo "cookie user has been deleted.";
  header('Location: users-register.php');
?>
