package cn.edu.swu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 *定时刷新
 *设置Refresh头，表示定时刷新
 */
@WebServlet("/DServlet")
public class DServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 响应体
		 */
		PrintWriter  writer=response.getWriter();
		writer.print("欢迎登陆,5秒钟自动跳转到主页");
		/*
		 * 设置Refresh头
		 */
		response.setHeader("Refresh", "5;URL=/test01/EServlet");
	}

}
