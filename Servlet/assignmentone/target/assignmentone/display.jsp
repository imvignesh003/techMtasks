<%@ page import="com.assignment.one.model.User" %>
<%
    User user = (User) request.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
</head>
<body>
    <h2>Submitted User Details:</h2>
    <p><strong>Name:</strong> <%= user.getName() %></p>
    <p><strong>Email:</strong> <%= user.getEmail() %></p>
    <p><strong>Phone:</strong> <%= user.getPhone() %></p>
    <p><strong>Address:</strong> <%= user.getAddress() %></p>
    <p><strong>Gender:</strong> <%= user.getGender() %></p>
    <p><strong>Registration Status:</strong> <%= request.getAttribute("registrationStatus") %></p>
</body>
</html>
