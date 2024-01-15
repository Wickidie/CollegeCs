<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Codelab PHP1</title>

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> 
</head>
<body>
<div class="w3-row"><div class="w3-col s4 w3-center">
    <table class="w3-table-all w3-hoverable w3-striped">
        <thead>
            <tr class="w3-blue">
                <th>no 1</th>
                <th>no 2</th>
            </tr>
        </thead>
    </div>
    <?php
    for ($x = 0; $x <= 10; $x++) {
        echo "<tr>";
        echo "<td>The number is: $x</td>";
        echo "<td>The number is: $x</td>";
        echo "</tr>";
        } 
    
    ?>
</table>

<table class="w3-table w3-bordered">
<tr>
  <th>First Name</th>
  <th>Last Name</th>
  <th>Points</th>
</tr>
<tr>
  <td>Jill</td>
  <td>Smith</td>
  <td>50</td>
</tr>
</table>

</body>
</html>