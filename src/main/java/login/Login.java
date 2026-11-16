package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String message = request.getParameter("message");
		
		if(username.equals("sriram") && password.equals("123") )
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname", username);
			//line 40 simple redirect to welcome servlet
			//response.sendRedirect("Welcome");
			
			//line 43 redirect and pass the message in the url(?querymessage="+message)
			response.sendRedirect("Welcome?querymessage="+message);
			
			
			
			
		}else
		{
			response.sendRedirect("Error");
		}
		
	}

}
