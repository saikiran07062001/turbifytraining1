package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author saikirangud
 *
 */
public class JdbcConnectionExample {
	
	public static void main(String[] args) {
		 Connection on = null;
		try {
			Class.forName(args[0]); // step1 loading the driver
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "MYSQL123@");
			// estblishing connection
			System.out.println("connection established");
			Statement stmt = on.createStatement();// creating statement
			Scanner sc=new Scanner(System.in);
			System.out.println("insert fullname");
			String a=sc.nextLine();
			System.out.println("insert idno");
			String b=sc.nextLine();
			System.out.println("insert department");
			String c=sc.nextLine();
			Sc.close();
			
			stmt.executeUpdate("insert into employee values('"+(a)+"',"+(b)+",'"+(c)+"')");
			// stmt.executeUpdate("delete from employee WHERE idno='631'");
			// stmt.executeUpdate("update employee set fullname='sai'");
			ResultSet st = stmt.executeQuery("select * from employee");
			while (st.next()) {
				System.out.println(st.getString(1) + " " + st.getInt(2)+" "+st.getString(3));
			}
			
		} catch (SQLException e1) {
			System.out.println(e1);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		finally{
			try{
				on.close();
			}
			catch(Exception e){
				System.out.println(e);
				
			}
		}
	}
}
