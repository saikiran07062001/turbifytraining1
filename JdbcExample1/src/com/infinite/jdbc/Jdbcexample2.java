package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author saikirangud
 *
 */
public class Jdbcexample2 {

	public static void main(String[] args) {
		Connection on = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(args[0]); // step1 loading the driver
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "MYSQL123@");
			// estblishing connection
			System.out.println("connection established");
			PreparedStatement ps = on.prepareStatement("insert into employee values(?,?,?)");// creating
																								// statement
			System.out.println("enter full name");
			ps.setString(1, sc.next());
			System.out.println("enter id no");
			ps.setInt(2, sc.nextInt());
			System.out.println("enter department");
			ps.setString(3, sc.next());
			int status = ps.executeUpdate();

			if (status == 1) {
				System.out.println("inserted successfully");
			} else {
				System.out.println("failed to insert");
			}
		} catch (SQLException e1) {
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
