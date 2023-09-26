package com.infinite.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infinite.jdbc.JdbcConnectionExample;

/**
 * Servlet implementation class LogServlet
 */
public class Logservlet extends HttpServlet {
	private static final Logger logger = Logger.getLogger(Logservlet.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
	public static void main( String[] args )
    {
        System.out.println( "Hello Infinite Solutions...." );
    }
    public Logservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("Loggy<br/>");
		System.out.println("debug message");
		System.out.println("info message");
		System.out.println("warn message");
		System.out.println("error message");
		System.out.println("fatal message");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

