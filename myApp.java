package foo;
import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.View;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mysql.jdbc.ResultSetMetaData;
import javax.servlet.http.*;
import java.util.*;
	import java.io.*;
import foo.employee;
			   public class employess extends HttpServlet {
			   	
			   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			   		response.setContentType("text/html");
			   		Connection conn = null;
			   		   Statement statement = null;
			   		   String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			   		   String DB_URL = "jdbc:mysql://localhost:3306/mayank";
			   		   String USER = "root";
			   		   String PASS = "";
			   		  
			   		  
			   		   
			   		   

			   		   try{
			   			   Class.forName("com.mysql.jdbc.Driver");
			   			   conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   			    statement = conn.createStatement();
			   			   String sqlStatement = "SELECT * from test";
			   			   ArrayList<employee> list = new ArrayList<employee>();
                           			   			  
			   			   ResultSet rs = statement.executeQuery(sqlStatement);
			   			   
		                   
		                   while(rs.next())
		                   {
			   				  
			   			   		employee e1 = new employee();
			   			   		ArrayList<employee> list11 = new ArrayList<employee>();
				               e1.setFirstname( rs.getString("firstname"));
				               e1.setLastname( rs.getString("lastname"));   
				               e1.setId( rs.getInt("id"));
				               e1.setAge(rs.getInt("age"));
				               list.add(e1);
				               System.out.print(list11);
				               request.setAttribute("lISt", list11 );
				   			   
			   			       ServletContext sc = getServletContext();
					   		   RequestDispatcher View = sc.getRequestDispatcher("retrieveThruDb.jsp");
					   		   View.forward(request, response);
			   			   
			   			   conn.close();
			   			   }	
			   			   
			   		   }  catch(SQLException se)
			   		   {
			   			   se.printStackTrace();
			   		   }   
			   		  catch(ClassNotFoundException e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(statement!=null)
					         {      statement.close();
					         }
					         if(conn!=null)
					         {  conn.close(); }
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }   			      		  

			   		  
			   			   
			   			}
			   			}//end FirstExample
			  
