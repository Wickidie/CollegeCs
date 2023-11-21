<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://www.w3schools.com/w3css/4/w3.css" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
    <div class="w3-container">
        <p><b> Characters </b></p>

    <div class="w3-row"><div class="w3-col s4 w3-center">
    <table class="w3-table-all w3-hoverable w3-stripped" id ="table">
        <thead>
            <tr class="w3-blue">
                <th>No.</th>
                <th> Avatar </th>
                <th> Character Name </th>
                <th> Actions </th>
            </tr>
</thead>
    <?php

    if (isset($_POST['userID']) && isset($_POST['password'])){
        if($_POST['userID']!= "admin" || $_POST["password"]!= "admin"){
            header('Location: login.php');
        }else{
            $session = 1;
        }
    }
    else{
        header('Location: login.php');
    }

    $characters = array(
        array("Kaedehara Kazuha","Boss of All Boss", "img_avatar1.png"),
        array("Neuvillette","The Judge","img_avatar2.png"),
        array("Xingqiu","The Manager","img_avatar3.png"),
        array("Kamisato Ayaka","Secretary","img_avatar4.png"),
        array("Kuki Shinobu","Staff IT", "img_avatar5.png")
    );

    for($x = 0; $x <count($characters); $x++){
        echo "<tr>";
        echo "<td style='vertical-align:middle'>" . $x + 1 . "</td>";
        echo "<td style='vertical-align:middle'> <img src= 'https://www.w3schools.com/w3css/".$characters[$x][2]."' class='w3-circle' alt='Person' style='width:50px'>";
        echo "<td style='vertical-align:middle'>" . $characters[$x][0] . "</td>";
        echo "<td style='vertical-align:middle'> <a href='detail_user.php?user=".$x."'>
        <i class ='material-icons'>folder_shared</i></a>&nbsp;
        <i class='material-icons'>delete_forever</i></td>";
        echo "</tr>";
    }
    ?>
    </table>
    <p><b><button class="w3-button w3-light-blue" onclick="window.print()"> Print Report </button> </b> </p>
</div>
</div>
<p>
    <!-- sign out -->
    <div class="w3-row"><div class ="w3-col s4">
        <b> <a href="login.php"> <button class="w3-button w3-red"> Sign out </button> </a> </b> </p>
    </div>
</div>

</body>
</html>