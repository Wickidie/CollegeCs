<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="www.w3schools.com/w3css/4/w3.css" rel="stylesheet"> 
</head>
<body>
    <div class="w3-container">
        <p><b> Characters </b></p>

    <ul class="w3-ul-w3-border" style="width:200px">
    <?php
    //$cars = array("Volvo","BMW", "Toyota");
    //echo "I like " . $cars[0] . ", " . $cars[1] . " and " . $cars[2] . ".";

    $characters = array("Kaedehara Kazuha", "Kuki Shinobu", "Neuvillette","Kamisato Ayaka","Keqing","Barbara","Xingqiu");
    $arraylength = count($characters);
    for ($x = 0; $x < $arraylength; $x+=1){
        echo "<li> $characters[$x] </li>";
        echo "<br>";
    }
    ?>
    </ul>
    


</body>
</html>