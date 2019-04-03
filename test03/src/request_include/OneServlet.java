package request.include;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OneServlet
 */
@WebServlet("/include/OneServlet")
public class OneServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("One");
		response.setHeader("aaa", "mmm");//设置响应头
		response.getWriter().print("OneOneOne");//设置响应体 这句不能出现 留头不留体。
		//这句话等同于调用CServlet的service方法。
		request.getRequestDispatcher("/include/TwoServlet").include(request, response);
	}

}
