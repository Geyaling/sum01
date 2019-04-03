package cn.edu.swu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 重定向
 * 1.设置302
 * 2.设置Location 头
 */
@WebServlet("/BServlet")
public class BServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setHeader("Location","/test01/CServlet");
//		response.setStatus(302);
		response.sendRedirect("http://www.baidu.com");
	}

}
