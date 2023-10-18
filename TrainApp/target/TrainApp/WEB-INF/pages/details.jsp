<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.infinite.train.HikariCPTest"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<fieldset>
	<Style>
body {
	text-align: center;
}
</Style>
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table, th, td {
	border: 1px solid black;
}

table.center {
	margin-left: 200px;
	margin-right: 400px;
}
</style>
<title>Train Details Page</title>
	</head>
	<body>
		<%@include file="display.jsp"%>
		<%
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			response.setContentType("text/html");
			PrintWriter ou = response.getWriter();
			DataSource datasource = HikariCPTest.getDataSource();
			con = datasource.getConnection();
			ps = con.prepareStatement("select * from train where trainno=?");
			ps.setInt(1, Integer.parseInt(request.getParameter("trainno")));
			out.println("<html><body>");
			rs = ps.executeQuery();
			out.println("<html><body><center><h2>Displaying Train Details</h2></center><br><br></body></html");
			while (rs.next()) {
				//int i=1;
				out.println(
						"<html><body><center><table><tr><th>Train Number</th><th>Train Name</th><th>Source</th><th>Destination</th><th> arrival Time</th><th>departure time</th><th>reach time</th></tr><tr><td>"
								+ rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
								+ "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>"
								+ rs.getString(6) + "</td><td>" + rs.getString(7)
								+ "</td></tr></center><br></body></html>");
			}
		%>
		<form action="logout" method="post">
			<input type="submit" value="Logout">
		</form>
	</body>
</fieldset>
</html>