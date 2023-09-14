package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbcexp1 {
	public static void main(String[] args) {
		Connection on = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // step1 loading the driver
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "MYSQL123@");
			// estblishing connection
			System.out.println("connection established");
			PreparedStatement ps = on.prepareStatement("insert into employee values(?,?,?)");// creating
																							// statement
			Scanner sc = new Scanner(System.in);
			System.out.println("insert fullname");
			String a = sc.next();
			if (a.length() == 1) {
				System.out.println("record inserted");
				ps.setString(1, a);
				System.out.println("insert idno");
				ps.setInt(2, sc.nextInt());
				System.out.println("insert department");
				ps.setString(3, sc.next());
				int status = ps.executeUpdate();
				if (status == 1)
					System.out.println("record inserted successfully");
				else
					System.out.println("record failed");
				// ps.executeUpdate("insert into employee
				// values('"+(a)+"',"+(b)+",'"+(c)+"')");
				// stmt.executeUpdate("delete from employee WHERE idno='631'");
				// stmt.executeUpdate("update employee set fullname='sai'");
				ResultSet st = ps.executeQuery("select * from employee");
				while (st.next()) {
					System.out.println(st.getString(1) + " " + st.getInt(2) + " " + st.getString(3));
				}
			}
		}

		catch (SQLException e1) {
			System.out.println(e1);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				on.close();
			} catch (Exception e) {
				System.out.println(e);

			}
		}

	}
}
