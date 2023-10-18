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
public class LoginController {
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		Connection con = null;
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		try {
			DataSource datasource = HikariCPTest.getDataSource();
			con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement("select email,password from registrationfrom where email=?");
			ps.setString(1, email);
			//ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString(1).equals(email)) {
					if (rs.getString(2).equals(password)) {
						return "display";
					} else {
						return "invalid";
					}
				} else {
					return "invalid";
				}
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return "invalid";
	}
}