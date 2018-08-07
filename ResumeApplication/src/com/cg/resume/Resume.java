package com.cg.resume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resume
 */
@WebServlet("/Resume")
public class Resume extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Resume() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String firstname=request.getParameter("firstname");
		/*String htmlResponse="<html>";
		htmlResponse="<h2>name is"+firstname+"</h2>";
		htmlResponse="</html>";
		out.print("<html><body>");
		out.print("Hello"+firstname);*/
	//out.print(htmlResponse);
	out.println("Hello"+firstname);
	String lastname=request.getParameter("lastname");
	out.println("LAstname"+lastname);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
 
