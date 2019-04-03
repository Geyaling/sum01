package cn.edu.swu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *获取客户端的IP地址
 *获取请求方式
 *获取User-Agent
 *得到客户端的信息，操作系统信息
 */
@WebServlet("/AServlet")
public class AServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String addr = request.getRemoteAddr();//获取客户端的IP 地址
		System.out.println("IP:"+addr);
		System.out.println("请求方式"+request.getMethod());//获取请求方式
		/*
		 * 在地址栏GET
		 * 点击超链接GET
		 * 表单：默认GET，可设置为POST
		 */
		String agent = request.getHeader("User-Agent");//获取User-Agent请求头
		System.out.println(agent);
		if(agent.toLowerCase().contains("firefox")) {
			response.getWriter().println("Hello,"+addr+",Firefox client,fine,thanks");
		}else if(agent.toLowerCase().contains("chrome")){
			response.getWriter().println("Hello,"+addr+",Chrome client,fine,thanks.");
		}else if(agent.toLowerCase().contains("msie")) {
			response.getWriter().println("Hello,"+addr+",IE client,fine,thanks.");
		}
	}

}
