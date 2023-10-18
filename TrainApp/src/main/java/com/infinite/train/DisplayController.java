package com.infinite.train;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class DisplayController {
	@RequestMapping(value = "/show")
	public String traindetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			DataSource datasource = HikariCPTest.getDataSource();
			con = datasource.getConnection();
			ps = con.prepareStatement("select * from train where trainno=?");
			ps.setInt(1, Integer.parseInt(request.getParameter("trainno")));
			out.println("<html><body>");
			out.println("<h3>Train Details<h3>");
			out.println("<table border=1>"
					+ "<tr>" + "<td><b>" + "Train no" + "</b></td>" + "<td><b>" + "Train name" + "</b></td>" + "<td><b>"
					+ "Source" + "</b></td>" + "<td><b>" + "Destination" + "</b></td>" + "<td><b>" + "Arrival Time"
					+ "</b></td>" + "<td><b>" + "Departure Time" + "</b></td>" + "<td><b>" + "Reach Time" + "</b></td>"
					+ "</tr>");
			//out.println("<a href="www.irctc.co.in"></a>");
			rs = ps.executeQuery();
			while (rs.next()) {
				// out.println(rs.getInt(1)+"<br>"+rs.getString(2)+"<br>"+rs.getString(3));
				out.println("<tr>" + "<td>" + rs.getInt(1) + "</td>" + "<td>" + rs.getString(2) + "</td>" + "<td>"
						+ rs.getString(3) + "</td>" + "<td>" + rs.getString(4) + "</td>" + "<td>" + rs.getString(5)
						+ "</td>" + "<td>" + rs.getString(6) + "</td>" + "<td>" + rs.getString(7) + "</td>" + "</tr>");
				//return "traininfo";
				// i++;
				// +"<td>" + rs.getString(2) + "</td>" +"<td>" + rs.getInt(3) +
				// "</td>"+"<td>" + rs.getInt(4) + "</td>" +"<td>" +
				// rs.getInt(5) + "</td>"
			}
			out.println("</body></html>");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				// con.rollback();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
}
}
