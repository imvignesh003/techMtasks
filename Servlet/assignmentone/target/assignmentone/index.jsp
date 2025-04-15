<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>
<body>
    <h2>User Registration Form</h2>
    <form action="UserController" method="post">
        Name: <input type="text" name="name"><br><br>
        Email: <input type="email" name="email"><br><br>
        Phone: <input type="text" name="phone"><br><br>
        Address: <textarea name="address"></textarea><br><br>
        
        Gender:
        <input type="radio" name="gender" value="Male">Male
        <input type="radio" name="gender" value="Female">Female<br><br>

        Hobbies:
        <input type="checkbox" name="hobbies" value="Reading">Reading
        <input type="checkbox" name="hobbies" value="Traveling">Traveling
        <input type="checkbox" name="hobbies" value="Gaming">Gaming<br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
