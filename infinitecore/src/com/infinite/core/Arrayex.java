package com.infinite.core;

public class Arrayex {
public static void main(String [] args){
	String y[]={"monday","tuesday","wednesday","thursday"};
	String e=y[2].toUpperCase();
	char t[]=e.toCharArray();
	int p=t.length-1;
	while(p>=0){
		System.out.println(t[p]);
		p--;
	}
}
}
