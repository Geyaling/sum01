package cn.edu.swu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CServlet")
public class CServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("two");
		response.setHeader("bbb", "BBB");//设置响应头
		response.getWriter().print("hello twotwotwo");//设置响应体
	}

}
