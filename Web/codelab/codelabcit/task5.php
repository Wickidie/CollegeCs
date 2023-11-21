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
        <p><b> Monthly Report 2023 </b></p>
        <p>Seach for Merk </p>


    <input class="w3-input w3-border w3-padding" type="text" placeholder="Search for Merk.." id="search_input" onkeyup="local_search()">
    <br>

    <div class="w3-row"><div class="w3-col s4 w3-center">
    <table class="w3-table-all w3-hoverable w3-stripped" id ="table">
        <thead>
            <tr class="w3-blue">
                <th>No.</th>
                <th> Merk </th>
                <th> In Stock </th>
                <th> Sold </th>
            </tr>
</thead>
    <?php
    //task 5. Local Search
    $cars = array(
        array("Volvo",22,18),
        array("BMW",15,13),
        array("Saab",5,2),
        array("Land Rover",17,15)
    );

    for($x = 0; $x <count($cars); $x++){
        echo "<tr>";
        echo "<td>" . $x + 1 . "</td>";
        for($y = 0; $y < count($cars) - 1; $y++){
            echo "<td>". $cars[$x][$y] ."</td>";
        }
        echo "</tr>";
    }

    ?>
    </table>
</div>
</div>
</div>


</body>
</html>