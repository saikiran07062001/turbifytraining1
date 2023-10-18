package com.infinite.train;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class RegistrationController {
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String insertmedicine(HttpServletRequest request, HttpServletResponse response) {
		Connection con = null;
		String firstname= request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String phoneno = request.getParameter("phoneno");
		int age= Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
		// PreparedStatement pstmt=null;

		try {
			DataSource datasource = HikariCPTest.getDataSource();
			con = datasource.getConnection();
			// getting parameters from jsp file using request.getparameter
			PreparedStatement ps = con.prepareStatement("insert into registrationfrom values(?,?,?,?,?,?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, phoneno);
			ps.setInt(4, age);
			ps.setString(5, gender);
			ps.setString(6, email);
			ps.setString(7, password);
			// inserting to db using set
			int x = ps.executeUpdate();
			if(firstname.equals(firstname)){
			if (x != 0) {
				return "insert";// updating
			} else {
				return "invalid";
			}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				con.close(); // closing db connection in try block
			} catch (Exception e1) {
				System.out.println(e1);
			}
		}
		return null;
	}
	}