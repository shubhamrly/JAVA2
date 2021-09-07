package loginfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lf
 */
@WebServlet("/lf")
public class lf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 String UN = request.getParameter("un");
		 String PA = request.getParameter("pa");
		    out.println("<body style='background-color:red;'>");

		 if(UN.equals("")&&UN.length()<4)
		 {
			 out.println("<font  >You Idiot");
		 }
		 if(PA.equals(""))
		 {
			 
		 }
		 if(UN.equals("ADMIN")&& PA.equals("ADMIN"))
		 {
			 response.sendRedirect("logins.jsp?un="+UN);
			 //out.println("<font color=blue><b>Welcome</b></font>");
		 }
		 else
		 {//out.println("<font color=blue><b>fuck-OFF</b></font>");
		   response.sendRedirect("loginF.jsp?username="+UN);
		 }
		 out.close();
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 String UN = request.getParameter("un");
		 String PA = request.getParameter("pa");
		    out.println("<body style='background-color:red;'>");

		 if(UN.equals("")&&UN.length()<4)
		 {
			 out.println("<font  >You Idiot");
		 }
		 if(PA.equals(""))
		 {
			 
		 }
		 if(UN.equals("ADMIN")&& PA.equals("ADMIN"))
		 {
			 response.sendRedirect("logins.jsp?un="+UN);
			 //out.println("<font color=blue><b>Welcome</b></font>");
		 }
		 else
		 {//out.println("<font color=blue><b>fuck-OFF</b></font>");
		   response.sendRedirect("loginF.jsp?username="+UN);
		 }
		 out.close();
	
	}
	
}

