package cn.edu.swu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AServlet")
public class AServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.先获取来使用iso的错误字符串
		 * 2.回退，(使用utf-8)重编
		 */
		String name=request.getParameter("username");
		byte[] bytes=name.getBytes("iso-8859-1");
		name=new String(bytes,"utf-8");
		System.out.println(name);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.POST 在获取参数之前，需要先调用request.setCharacterEncoding("utf-8");
		 * 2.使用getParameter获取参数。
		 */
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		System.out.println(username);
	}

}
