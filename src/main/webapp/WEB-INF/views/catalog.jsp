<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <title>Catalog</title>
    <link rel="stylesheet" href="/styles/style.css">
</head>
<body>
    <h2>Catalog</h2>
    <jsp:include page="menu.jsp"/>
    <% for (int i = 1; i <= 9; i++) {
        session.setAttribute("prodId", i);%>
        <jsp:include page="product.jsp"/>
        <%};%>
</body>
</html>
