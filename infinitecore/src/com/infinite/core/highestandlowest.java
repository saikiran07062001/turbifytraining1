//@sai kiran
package com.infinite.core;

public class highestandlowest {
public static void main(String[] args){
	int a=90,b=690,c=78;
	// comapring a with b and c for greatest number
	if(a>b && a>c)
	{
		System.out.println("a is a greatest number"+a);
	}
	//comparing b with a and c for greatest number
	else if (b>a&&b>c)
	{
		System.out.println("b is a greatest number"+b);
	}
	//comparing c with a and b for greatest number
	else if (c>a&&c>b)
	{
		System.out.println("c is a greatest number"+c);
	}
	// comapring a with b and c for lowest number
	
	if(a<b && a<c)
	{
		System.out.println("a is a lowest number"+a);
	}
	//comparing b with a and c for lowest number
	else if (b<a&&b<c)
	{
		System.out.println("b is a lowest number"+b);
	}
	//comparing c with a and b for lowest number
	else if (c<a&&c<b)
	{
		System.out.println("c is a lowest number"+c);
	}	
}
}
