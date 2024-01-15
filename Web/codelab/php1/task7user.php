<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Codelab PHP1</title>

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> 
</head>
<body>
  
<div class="w3-container">
  <h2>Card Example</h2>
    <?php
    $cars = array(
        array("Volvo", "img_avatar1.png"),
        array("BMW", "img_avatar2.png"),
        array("Saab", "img_avatar3.png"),
    );

    $user = $_GET['user'];

    echo "<div class='w3-card' style='width:50%'>";
    echo "<div class='w3-container'>";
    echo "<img src='https://www.w3schools.com/w3css/" . $cars[$user][1] . "' style='width:50%>'";
    echo "<p>" . $cars[$user][0] . "</p>";
    echo "</div>";
    echo "</div><br />";
    
    ?>
  </div>
</div>

</body>
</html>