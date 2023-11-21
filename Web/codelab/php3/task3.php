<?php
  include_once 'db-connect.inc.php';

  $sql = "INSERT INTO users (userid, passcode, avatar)
  VALUES ('xinqiu', 'xinqiu', 'img_avatar3.png')";

  if (mysqli_query($conn, $sql)) {
    echo "1 New record created successfully";
  } else {
    echo "Error: " . $sql . "<br>" . mysql_error($conn);
  };

  mysqli_close($conn);

?> 
