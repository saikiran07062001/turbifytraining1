package com.infinite.Lob;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Bloboutputexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection on = null;

		try {
			Class.forName(args[0]); // step1 loading the driver
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "MYSQL123@");// estblishing
																											// connection
			System.out.println("connection established");
			PreparedStatement ps = on.prepareStatement("select * from imgtable");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// now on 1st row

				Blob b = rs.getBlob(2);// 2 means 2nd column data
				byte barr[] = b.getBytes(1, (int) b.length());// 1 means first
																// image
				FileOutputStream fout = new FileOutputStream("D:\\images\\n2.png");
				fout.write(barr);
				System.out.println("record displayed");
				fout.close();
			}
		} catch (SQLException e1) {
			System.out.println(e1);
		} catch (Exception e) {
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
