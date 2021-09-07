package ss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
/**
 * Servlet implementation class Pss
 */
@WebServlet("/Pss")
public class Pss extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     String UN = request.getParameter("un");
	     String PA = request.getParameter("pa");
	     PrintWriter out= response.getWriter();   
	     if(UN.equals(""))
	     {
	    	 
	     }
	     if(PA.equals(""))
	     {
	    	 out.println("go away pass");
	     }
	  out.close();
	}
*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String UN = request.getParameter("un");
	     //String PA = request.getParameter("pa");
	     PrintWriter out= response.getWriter();   
	     Cookie c = new Cookie("un",request.getParameter("un"));
	      response.addCookie(c);
	     if(UN.equals("ADMIN"))
	     {
	    	 RequestDispatcher rd = request.getRequestDispatcher("Sucess.jsp");
	    	 request.setAttribute("un", UN );
	    	 
	    	 rd.forward(request, response);
	    	 //out.println("go away username GET");
	        //response.sendRedirect("Failure.jsp?un="+UN);
	     }
	     else{
	    	
	    	 //RequestDispatcher rd = request.getRequestDispatcher("fil1.html");
	    	 //rd.include(request, response);
	    	 //out.println("<font color : red>go away pass GET</font>");
	         response.sendRedirect("Faliure.jsp");
	     }
	  out.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		//String UN = request.getParameter("un");
		session.setAttribute("un", request.getParameter("un") );
		response.sendRedirect("Failure.jsp");
		/*
		 * 
		Cookie c =  new Cookie("un",UN);
		response.addCookie(c);
		PrintWriter out = response.getWriter() ;
		out.print("<a href = 'Sucess.jsp'> Click- me" );
		
		
	  out.close();*/
	}

}
