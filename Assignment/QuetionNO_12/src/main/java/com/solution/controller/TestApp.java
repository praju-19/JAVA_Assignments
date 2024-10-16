
/*Write a Java servlet that reads the data from a MySQL database table and displays it
 in an HTML table on the web page. The servlet should use JDBC to connect to the
 database and retrieve the data*/


package com.solution.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.solution.data.Student;
import com.solution.main.SelectApp;


@WebServlet("/demo")
public class TestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  static {
   	   System.out.println("Test App file loading...");
      }

    
    public TestApp() {
        super();
        System.out.println("Test App file is Instantiation");

    }

	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = request.getParameter("id");
		 
	      Integer id1 = Integer.parseInt(id);
	      
         
//	      Student std = new Student();
//	      std.setId(id1);
	      
	      SelectApp app = new SelectApp();
	      
	      Student std = app.selectData(id1);
	      
	      PrintWriter out = response.getWriter();
	      
		    
	       out.println("<html><head><title>Result</title></head><body>");
	 	  out.println("<center>");
	 	  out.println("<h1>Student  Data</h1>");
	 	  out.println("<table border='1'>");
	 	  out.println("<tr> <th>ID</th>  <td>"+std.getId()+"</td> </tr>");
	 	  out.println("<tr> <th>Name</th>  <td>"+std.getName()+"</td> </tr>");
	 	  out.println("<tr> <th>Age</th>  <td>"+std.getAge()+"</td> </tr>");
	 	  out.println("<tr> <th>City</th>  <td>"+std.getCity()+"</td> </tr>");
	 	  out.println("</table>");
	 	  out.println("</br><button> <a href='index.html'> home page</a></button> ");
	 	  out.println("</center></body></html>");
	 	  
          out.close();
	}

}
