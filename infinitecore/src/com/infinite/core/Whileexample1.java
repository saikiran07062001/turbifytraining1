//@sai kiran
package com.infinite.core;

public class Whileexample1 {
public static void main(String[] args){
	int i=10;
	while(i<=80)
	{ 
		
		i=i+10;
		if(i==60){
			continue;
		}
		else{
			System.out.print(i+" ");
		}
	}
}
}
