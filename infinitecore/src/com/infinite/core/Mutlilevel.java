package com.infinite.core;
class A1{
	public static void display1()
	{
		System.out.println("1 method invoked");
	}
}
class B1{
	public static void display2()
	{
		System.out.println("2 method invoked");
	}
}
class C1{
	public static void display3()
	{
		System.out.println("3 method invoked");
	}
}
public class Mutlilevel {
public static void main(String[] arg){
	B1 obj =new B1();
	obj.display2();
}
}
