<?php
  session_start();
  include_once 'db-connect.inc.php';

  $userid = $_SESSION['userid'];

  if (isset($userid) && !empty($userid)) {
    // echo "$userid";
  }else{
    header('Location: users-login-form.php');
  }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Codelab PHP1</title>

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> 
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>

<header>
  <div class="w3-bar w3-light-grey w3-border w3-padding">
    <a href="#" class="w3-bar-item w3-button w3-mobile">Home</a>
    <a href="#" class="w3-bar-item w3-button w3-mobile">Link 1</a>
    <a href="#" class="w3-bar-item w3-button w3-mobile">Link 2</a>
    <input type="text" class="w3-bar-item w3-input w3-white w3-mobile" placeholder="Search..">
    <button class="w3-bar-item w3-button w3-green w3-mobile">Search</button>
  </div>
</header>

<div class="w3-container">
  <a href="users-register.php">
    <button class="w3-button w3-green w3-section w3-padding">Register Form</button>
  </a>
  <a href="users-login-form.php">
    <button class="w3-button w3-green w3-section w3-padding">
      Logout</button>
      <?php
        // session_destroy();
      ?>
  </a>
  <h2>Colored Table Heading</h2>
  <p>Use any of the w3-<em>color</em> classes to display a colored row:</p>

  <table class="w3-table-all w3-centered">
    <thead>
      <tr class="w3-red">
        <th>No</th>
        <th>Avatar</th>
        <th>Userid</th>
        <th>Passcode</th>
        <th>Action</th>
      </tr>
    </thead>
    <?php
      $sql = "SELECT `userid`, `passcode`, `avatar` FROM `users` WHERE 1";
      $result = mysqli_query($conn, $sql);
      $result_row = mysqli_num_rows($result);
      $i = 0;

      $item_per_page = 2;
      $total_page = ceil($result_row / $item_per_page);
      $current_page = isset($_GET['page']) ? $_GET['page'] : 1;
      $offset = ($current_page - 1) * $item_per_page;

      $sql = "SELECT `userid`, `passcode`, `avatar` FROM `users` LIMIT $offset, $item_per_page";
      $result = mysqli_query($conn, $sql);
      $result_row = mysqli_num_rows($result);

      if ($result_row > 0) {
        while ($row = mysqli_fetch_assoc($result)) {
          $i++;
          echo "<tr>" .
                "<td>" . $i . " " .  "</td>" .
                "<td>" . "<img src='https://www.w3schools.com/w3css/" . $row['avatar'] . "'style='width:50px'></td>" .  "</td>" .
                "<td>" . $row['userid'] . " " . "</td>" .
                "<td>" . $row['passcode'] . " " . "</td>" .
                "<td>" .
                  "<a href='users-update-form.php?userid=" . $row['userid'] . "'><span class='material-symbols-outlined'>build</span></a>" .
                  "<a href='users-delete.php?userid=" . $row['userid'] . "'><span class='material-symbols-outlined'>delete</span></a>" .
                  "<a href='users-detail.php?userid=" . $row['userid'] . "'><span class='material-symbols-outlined'>info</span></a>" .
                "</td>" .
              "</tr>";
        }
        echo "<div class='w3-center'>";
        echo "<div class='w3-bar w3-border w3-round'>";
        echo "<a href='users-list.php?page=1' class='w3-bar-item w3-button'>&laquo;</a>";
        for ($i=1; $i < $total_page + 1; $i++) { 
          
          echo "<a href='users-list.php?page=$i' class='w3-bar-item w3-button'>$i</a>";
        }
        echo "<a href='users-list.php?page=$total_page' class='w3-bar-item w3-button'>&raquo;</a>";
        echo "</div>";
        echo "</div>";
      }

      mysqli_close($conn);
    ?>
  </table>
</div>
