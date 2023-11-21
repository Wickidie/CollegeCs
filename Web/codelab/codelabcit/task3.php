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
        <p><b> Characters </b></p>
    <div class="w3-row"><div class="w3-col s4 w3-center">
    <table class="w3-table-all w3-hoverable w3-stripped">
        <thead>
            <tr class="w3-blue">
                <th>No.</th>
                <th>Name of Characters </th>
            </tr>
</thead>
    <?php
    //task3. Table
    $characters = array("Kaedehara Kazuha", "Kuki Shinobu", "Neuvillette","Kamisato Ayaka","Keqing","Barbara","Xingqiu");
    $arraylength = count($characters);

    for ($x = 0; $x < $arraylength; $x+=1){
        echo "<tr>";
        echo "<td>" . $x + 1 ."</td>";
        echo "<td> "." $characters[$x]"."</td>";
        echo "</tr>";
    }
    ?>
    </table>
</div>
</div>
</div>
    


</body>
</html>