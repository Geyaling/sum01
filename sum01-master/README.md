# Java Web Learning

## 课程要求
暂不确定

## 项目名称
暂不确定

## 项目简介
暂不确定

## 基本信息
- 学号: **222016321072001**
- 网址: [阿里云](http://120.79.241.229:8080/sum01/login.html)

## 第一周完成内容
- 第一个Servlet程序练习
- Servlet:
	+ 实现javax.servlet.Servlet接口
	+ 继承javax.servlet.GenericServlet类
	+ 继承javax.servlet.http.HttpServlet类

## 第二周完成内容
- Servlet基础学习:
	+ ServletConfig
	+ ServletContext    
	+ ServletRequest
	+ ServletResponse

## 第三周完成内容
- 完成[13 小结与练习(源码git链接)](https://github.com/Geyaling/sum01)
- 要求：[阿里云地址](http://120.79.241.229:8080/sum01/login.html)
	+ 在MySQL数据库中创建一个test_users数据表,添加3个字段：id,username,password,并录入几条记录
	+ 定义一个login.html里面定义两个请求字段:user password,发送请求到loginServlet
	+ 在创建一个LoginServlet,在其中获取请求的user，password
	+ 利用JDBC从test_users中查询有没有和页面输入的user,password对应的记录,XXX为user.
		+ 若有，响应:Hello:XXX
		+ 若没有，响应Sorry:XXX
