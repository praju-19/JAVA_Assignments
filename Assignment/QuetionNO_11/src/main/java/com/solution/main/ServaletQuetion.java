/*Create a Java servlet that reads the name of the user from a form and displays a
 welcome message on the web page. The servlet should use the GET method to read
 the input data from the user.*/


package com.solution.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/test")
public class ServaletQuetion extends HttpServlet {
	private static final long serialVersionUID = 1L;
      static {
    	  System.out.println("Servlet file loading...");
      } 
    
    public ServaletQuetion() {
        super();
        System.out.println("Servlet file instantation");
    }

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("html/text");
		String name = request.getParameter("name");
		
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<h1>"+ name +"</h1>");

		
	   System.out.println(name);
	  
	   
	   
	   out.close();
	   

		
	}

	

}
