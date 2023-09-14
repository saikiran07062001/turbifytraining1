package com.infinite.core;

import java.util.Scanner;

public class Array1 {
	int i;
	int a[]=new int[5];
	public void display(){
		Scanner sc= new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
		public static void main(String[] args)
		{
			Array1 ob=new Array1();
			ob.display();
		}
	}


