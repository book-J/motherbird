<%@ page import="motherbird.dto.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>title</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
    for (int i = 0; i < users.size(); i++) {
        User user = users.get(i);
        out.println(user.getId() + " " + user.getName());
    }
%>
</body>
</html>
