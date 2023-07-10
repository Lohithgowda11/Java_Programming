package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductDetails")
public class ViewRecordbyId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewRecordbyId() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int id = Integer.parseInt(request.getParameter("productid"));
			
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root","root");
		 Connection con = DBConnection.getConnection();
			PreparedStatement pt = con.prepareStatement("select * from student where rollno = ?");
		
			pt.setInt(1,id);
			ResultSet rs = pt.executeQuery();
			PrintWriter out=response.getWriter();
			
			while(rs.next()) {
				out.print("<br>");
				out.print(	rs.getInt("rollno"));
				out.print("<br>");
				out.print(rs.getString("name"));
				out.print("<br>");
				out.print(rs.getFloat("marks"));
				
			}
			pt.execute();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
