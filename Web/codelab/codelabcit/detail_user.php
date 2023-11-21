<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://www.w3schools.com/w3css/4/w3.css" rel="stylesheet"> 
</head>
<body>
    <div class="w3-container">
        <p><a href='User.php'> <b> Characters </b></a>/Character Details
    <?php
    $characters = array(
        array("Kaedehara Kazuha","Boss of All Boss", "img_avatar1.png"),
        array("Neuvillette","The Judge","img_avatar2.png"),
        array("Xingqiu","The Manager","img_avatar3.png"),
        array("Kamisato Ayaka","Secretary","img_avatar4.png"),
        array("Kuki Shinobu","Staff IT", "img_avatar5.png")
    );

    $user = $_GET['user'];


    echo "<div class='w3-card' style='width:25%'>";
    echo "<img src='https://w3schools.com/w3css/" . $characters[$user][2] . "' style ='width:100%' alt='Person''>";
    echo "<div class='w3-container'>";
    echo "<h4><b>" . $characters[$user][0] . "</b> </h4>";
    echo "<p>" . $characters[$user][1] . "</p>";
    echo "</div>";
    echo "</div> </br> ";
    ?>
</div>
</body>
</html>