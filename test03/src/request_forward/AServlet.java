package cn.edu.swu;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request 获取请求参数！！！
 * @author geralyn
 *ctrl+shfit+o 自动导入包
 *alt+/自动补全
 */

@WebServlet("/AServlet")
public class AServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET:"+request.getParameter("xxx"));
		System.out.println("GET:"+request.getParameter("yyy"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String [] hobby = request.getParameterValues("hobby");
		System.out.println("POST:"+username);                                  
		System.out.println("POST:"+password);
		System.out.println("POST:"+Arrays.toString(hobby));
		/*
		 *测试获取所有请求参数的名称 Enumeration getParameterNames()
		 **/
		Enumeration names = request.getParameterNames();
		while(names.hasMoreElements()) {
			System.out.println(names.nextElement());
		}
		/*获取所有请求参数，封装到map
		 * 
		 */
		Map<String,String[]> maps=request.getParameterMap();
		for(String name:maps.keySet()) {
			String[] values=maps.get(name);
			System.out.print(name+":"+Arrays.toString(values));
		}
	}

}
