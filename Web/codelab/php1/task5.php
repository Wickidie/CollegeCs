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
    <p>Monthly Report</p>
    <input class="w3-input w3-border w3-padding" type="text" placeholder="Search for names.." id="myInput" onkeyup="searchTable()">
    <table class="w3-table-all w3-hoverable w3-striped" id="myTable">
        <thead>
            <tr class="w3-blue">
                <th>No</th>
                <th>Merek</th>
                <th>In Stock</th>
                <th>Sold</th>
            </tr>
        </thead>
    </div>
    <?php
    $cars = array(
        array("Volvo", 22, 18),
        array("BMW", 22, 18),
        array("Saab", 22, 18),
        array("Land Rover", 22, 18)
    );

    for ($line = 0; $line < 4; $line++) {
        echo "<tr>";
        echo "<td>" . $line + 1 .  "</td>";
        for ($column=0; $column < 3; $column++) { 
            echo "<td>" . $cars[$line][$column] . "</td>";
        }
        echo "</tr>";
    }
    
    ?>
</table>

<div class="w3-row"><div class="w3-col s4 w3-center">
    <table class="w3-table-all w3-hoverable w3-striped">
        <thead>
            <tr class="w3-blue">
                <th>First Name</th>
                <th>Last Name</th>
                <th>Points</th>
            </tr>
            <tr>
                <td>Jill</td>
                <td>Smith</td>
                <td>50</td>
            </tr>
        </thead>
    </div>
</table>

<script>
function searchTable() {
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  table = document.getElementById("myTable");
  filter = input.value.toUpperCase();
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}
</script>
</body>
</html>