<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <link href="https://www.w3schools.com/w3css/4/w3.css" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>

<div class="w3-container">

  <div id="" class="">
    <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

      <form class="w3-container" action="users-update.php" method="post">

        <div class="">
          <?php
            $userid = $_GET['userid'];
            echo "<h3>UPDATE $userid</h3>";
          ?>
        </div>
        <div class="w3-section">
          <label><b>Password</b></label>
          <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Password" required
              name="passcode">
          <label><b>RePassword</b></label>
          <input class="w3-input w3-border" type="text" placeholder="Enter Password" required
              name="repasscode">
        <?php
          $userid = $_GET['userid'];
          echo "<button class='w3-button w3-block w3-green w3-section w3-padding' type='submit'
                name='userid' value='$userid' >Update</button>";
        ?>
        </div>
      </form>
      <div>
        <a href="users-list.php">
          <button class="w3-button w3-green w3-section w3-padding">User List</button>
        </a>
      </div>

    </div>
  </div>
</div>
            
</body>
</html>
