<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
	获取Cookie
    </title>
</head>
<body>
    <h1>获取Cookie</h1>
    <%
	Cookie[] cookies=request.getCookies();
	for(Cookie c:cookies){
	    out.print(c.getName()+"="+c.getValue()+"<br/>");
	}
    %>
</body>
</html>
