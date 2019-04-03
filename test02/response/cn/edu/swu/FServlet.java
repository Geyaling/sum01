package cn.edu.swu;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 响应字节数据
 */
@WebServlet("/FServlet")
public class FServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	
	 * String s="Hello OutputStream";
		byte[] bytes=s.getBytes();
		response.getOutputStream().write(bytes);
	*/
		/*
		 * 1.把一张图片读取到字节数组中
		 */
		String path="/home/geralyn/eclipse-workspace/fx.jpeg";
		FileInputStream in = new FileInputStream(path);
		byte[] bytes=org.apache.commons.io.IOUtils.toByteArray(in);//读取输入流内的字节到字节数组中
		response.getOutputStream().write(bytes);
		} 

}
