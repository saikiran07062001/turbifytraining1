package com.infinite.core;

import java.util.*;

public class Funcexample {
	public static void swap(int n,int m) {
		
		int temp = 0;
		temp = n;
		n = m;
		m = temp;
		System.out.println(n);
		System.out.println(m);

	}
	public static void Table(int i){
		int j=2;
		while(i>=10){
			System.out.println(j+"*"+i+"="+i*j);
		}
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int i=1;
		swap(a,b);
		Table(i);
		
	}
}