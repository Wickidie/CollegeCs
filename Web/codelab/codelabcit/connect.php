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
        <form class="w3-cell w3-panel w3-border w3-hover-border-green" action="users-add.php" method="post">
            <h2> Users Registration </h2>
            <p> This form is used to add new user! </p>
            <p> <label><b> User ID </b></label>
            <input class="w3-input w3-border" name="userid" type="text"></p>
            <p> <label><b>Passcode </b> </label>
            <input class="w3-input w3-border" name="passcode" type="password"></p>
            <p> <label><b>Retype Passcode </b> </label>
            <input class="w3-input w3-border" name="repasscode" type="password"></p>
            <p align="right"> <button type="submit" class="w3-btn w3-green"> Register </button> 
            <button type="reset" class="w3-btn w3-red"> Reset </button>
            </p>
        </form>
    </div>
</body>
</html>