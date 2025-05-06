<%@ page import="com.assignment.one.model.User" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>List Users</title>
</head>
<body>
    <h2>All Users</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Address</th>
                <th>Gender</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<User> users = (List<User>) request.getAttribute("users");
                for(User user : users) {
                %>
                <tr>
                    <td><%= user.getName() %></td>
                    <td><%= user.getEmail() %></td>
                    <td><%= user.getPhone() %></td>
                    <td><%= user.getAddress() %></td>
                    <td><%= user.getGender() %></td>
                    <td>
                        <form action="UpdateController" method="get" style="display:inline;">
                            <input type="hidden" name="email" value="<%= user.getEmail() %>">
                            <input type="submit" value="update">
                        </form> |
                        <form action="DeleteController" method="post" style="display:inline;">
                            <input type="hidden" name="email" value="<%= user.getEmail() %>">
                            <input type="submit" value="delete">
                        </form>
                    </td>
                </tr>
                <%
                }
                %>

        </tbody>
    </table>
    <br>
    <a href="index.jsp">Add New User</a>
</body>
</html>