package sum01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet resultSet = null;
			
			PrintWriter out = response.getWriter();
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/testdb";
				String user="root";
				String password2="1xjjdcb1";
				connection = DriverManager.getConnection(url,user,password2);
                                System.out.println("111122223333");
				String sql = "SELECT count(id) FROM test_users WHERE username=? AND password=?";
				
				statement = connection.prepareStatement(sql);
				statement.setString(1,username);
				statement.setString(2,password);

				resultSet = statement.executeQuery();
				if(resultSet.next()){
					int count = resultSet.getInt(1);
					if(count>0){
						out.print("Hello:" + username);
					}else{
						out.print("Sorry:" + username);
					}
				}
			}catch (Exception e){
				e.printStackTrace();
			}finally{
								try{
									if(resultSet!=null){
										resultSet.close();
									}
								}catch(SQLException e){
									e.printStackTrace();
								}
								
								try{
									if(statement!=null){
										statement.close();
									}
								}catch(SQLException e){
									e.printStackTrace();
								}

								try{
									if(connection!=null){
										connection.close();
									}
								}catch(SQLException e){
									e.printStackTrace();
								}
			}
	}

}
