package com.Infinite.wallet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Depositmoney
 */
public class Deposite extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection on=null;
	ResultSet rs=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deposite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bal = Integer.parseInt(request.getParameter("balance"));
		int newbal = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");
			PreparedStatement ps = conn.prepareStatement("select balance from accounts where username=?");
			ps.setString(1, request.getParameter("username"));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int balance = rs.getInt("balance");
				newbal = balance + bal;
				PreparedStatement ps2 = conn.prepareStatement("update accounts set balance=? where username=?");
				ps2.setInt(1, newbal);
				ps2.setString(2, request.getParameter("username"));
				ps2.executeUpdate();
			}
			ps.close();
			response.sendRedirect("txnsuccess.html");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			try{
				on.close();
				rs.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
