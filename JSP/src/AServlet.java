import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s1 = request.getParameter("int1");
        String s2 = request.getParameter("int2");
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);

        int sum = num1+num2;

        request.setAttribute("result",sum);
        request.getRequestDispatcher("/jsp_start/result.jsp").forward(request,response);
    }

}

