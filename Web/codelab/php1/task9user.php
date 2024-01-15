<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Codelab PHP1</title>

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> 
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>

<div class="w3-container">
  <div class="w3-container w3-blue">
    <h2>Input Form</h2>
  </div>

  <form class="w3-container">
    <p>
    <label>Username</label>
    <input class="w3-input" type="text"></p>
    <p>
    <label>Password</label>
    <input class="w3-input" type="password"></p>
    <p><button type="submit" class="w3-button w3-green w3-round-large">Submit</button></p>
    <p><button type="submit" class="w3-button w3-red w3-round-large">Sign Out</button></p>
  </form>
</div>

<?php
  if (isset($_POST['username']) && isset($_POST['password'])){
    if ($_POST['username'] != "admin" || $_POST['password'] != "admin"){
      header('Location: task9.php');
    }else{
      $session = 1;
    }
  }else{
    header('Location: task9.php');
  }
?>


</script>
</body>
</html>