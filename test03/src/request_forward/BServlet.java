package cn.edu.swu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*！！！！！请求转发和请求包含！！！！！
 * 有时，一个请求需要多个Servlet协作完成，所以需要通过从一个Servlet跳到另一个Servlet
 * 一个请求跨多个Servlet,需要使用转发和包含。
 * 对于客户端是隐形的。
 * 域：在多个Servlet中共享数据。javaweb有三大域
 * RequestDispatcher rd = request.getRequestDispatcher("/AServlet");
 * 调用request对象的getRequestDispatcher()方法获取RequestDispatcher对象。(dispatcher 调度派遣)
 * 使用参数为被转发或被包含的Servlet路径（web.xml中的url-pattern）。
 * 请求转发：！！！！！重点rd.forward(request,response);
 * 由下一个Servlet完成既可以设置响应头，也可以设置响应体，当前Servlet设置响应头。AServlet留头不留体
 * 请求包含：rd.include(request,response);
 * 由两个Servlet共同完成响应体(使用response对象的两个流)和响应头。AServlet都留
 * 共同点：一个请求范围内。
 */
/*
 * 演示请求转发。（一个请求。至少两个Servlet 。第一个Servlet留头不留体 最后一个做响应体。）
 */
@WebServlet("/BServlet")
public class BServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("One");
		response.setHeader("aaa", "AAA");//设置响应头
//		for(int i=0;i<1024*24+1;i++) {
//			response.getWriter().print("a");//设置响应体 这句不能出现 留头不留体。
//		}//撑爆了
		response.getWriter().print("OneOneOne");//设置响应体 这句不能出现 留头不留体。
		//这句话等同于调用CServlet的service方法。
		request.getRequestDispatcher("/TwoServlet").forward(request, response);
	}

}
