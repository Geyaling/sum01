## 路径

### web.xml中url-pattern路径，（叫它Servlet路径！）
+ 要么以“*”开关，要么为“/”开头

### 转发和包含路径
+ !!!以“/”开头：相对当前项目路径，例如：http://localhost:8080/项目名/　request.getRequestdispacher("/BServlet").forward...();
+ 不以“/”开头：相对当前Servlet路径。 request.getRequestdispacher("/BServlet").for...();，假如当前Servlet是：http://localhost:8080/项目名/servlet/AServlet，　就是http://localhost:8080/项目名/servlet/BServlet

###  重定向路径（客户端路径）
+ 以“/”开头：相对当前主机，例如：http://localhost:8080/，　所以需要自己手动添加项目名，例如；response.sendRedirect("/day10_1/Bservlet");

### 页面中超链接和表单路径
+ 与重定向相同，都是客户端路径！需要添加项目名
+ `<form action="/day10_1/AServlet">`
`<a href="/day10_/AServlet">`
`<a href="AServlet">`如果不以“/”开头，那么相对当前页面所在路径。
 如果是http://localhost:8080/day10_1/html/form.html。　即：http://localhost:8080/day10_1/html/ASevlet
####  !!!建立使用以“/”开头的路径，即绝对路径！
	
### ServletContext获取资源路径
+ 相对当前项目目录，即当然index.jsp所在目录
### ClassLoader获取资源路径
+ 相对classes目录,所以不加斜杠。
###  Class获取资源路径
+ 以“/”开头相对classes目录
+ 不以“/”开头相对当前.class文件所在目录。
