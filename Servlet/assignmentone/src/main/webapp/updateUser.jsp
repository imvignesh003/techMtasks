
<%@ page import="com.assignment.one.model.User" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update User</title>
</head>
<body>
    <h2>Update User</h2>
    <% User user= (User) request.getAttribute("user"); %>

    <form action="UpdateController" method="post">
        Name: <input type="text" name="name" value="<%= user.getName() %>"><br><br>
        Email: <input type="text" name="email" value="<%= user.getEmail() %>"><br><br>
        Phone: <input type="text" name="phone" value="<%= user.getPhone() %>"><br><br>
        Address: <textarea name="address"><%= user.getAddress() %></textarea><br><br>

        Gender:
        <input type="radio" name="gender" value="Male"
            <%= "Male".equals(user.getGender()) ? "checked" : "" %>> Male

            <input type="radio" name="gender" value="Female"
            <%= "Female".equals(user.getGender()) ? "checked" : "" %>> Female<br><br>



        <input type="submit" value="Update">
    </form>
</body>
</html>