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
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String username= (String)session.getAttribute("uname");
		// message from quary rewritng
		String prname= request.getParameter("querymessage");
		PrintWriter out = response.getWriter();
		
		out.print("<h1> welcome "+username+"</h1>");
		out.print("message from quary rewriting: "+prname);
		//information from hidden input
		String hiddenValue = request.getParameter("hiddenvalue");
		out.print("<h1> message from hidden field"+ hiddenValue +"</h1>");
	}

}
