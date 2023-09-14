package com.infinite.core;

public class Count {
public static void main(String[] arg){
	String a="Returns the index within this string of the first occurrence";
	char[] b=a.toCharArray();
	int count=0;

	for(int i=0;i<b.length;i++)
	{
		if(b[i]=='r')
		count++;
	}
	System.out.print(count);
}
}
