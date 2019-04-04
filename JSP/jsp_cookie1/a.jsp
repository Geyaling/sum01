<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>保存cookie</title>
</head>
<body>
    <h1>保存cookie</h1>
    <%
        Cookie cookie1 = new Cookie("aaa","1AA");
        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("bbb","2BB");
        response.addCookie(cookie2);
    %>
</body>
</html>
