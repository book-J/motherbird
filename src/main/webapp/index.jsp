<%@ page import="DatabaseManager.DatabaseManager" %>
<%@ page import="motherbird.dto.User" %>
<%@ page import="com.j256.ormlite.dao.Dao" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
    hello world

    <%
        Dao<User, Long> userDao = DatabaseManager.getUserDao();

        try {
            userDao.create(new User((long) 1, "jonghan"));
            User user1 = userDao.queryForId((long) 1);
    %>
    <p>id: <%=user1.getId()%></p>
    <p>name: <%=user1.getName()%></p>

    <%
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    %>
</body>
</html>
