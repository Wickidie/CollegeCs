<?php
  include_once 'db-connect.inc.php';

  $user_search_list = '';
  if (isset($_POST['search'])) {
    if (!empty($_POST['search_value'])) {
      $search_value = $_POST['search_value'];
      $sql = "SELECT * FROM `users` where userid like '%$search_value%'";
      $search_result = mysqli_query($conn, $sql);
      $search_result_row = mysqli_num_rows($search_result);


    }
  }

?>