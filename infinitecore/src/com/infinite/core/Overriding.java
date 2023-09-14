package com.infinite.core;
class A
{
	public void display()
	{
		System.out.println("A");
	}
}
	class B extends A
	{
		public void display()
		{
			super.display();
		System.out.println("B");
		}
	}
		class C extends B
		{
			public void display()
			{
				super.display();
			System.out.println("C");
			}
		}
		
	
	public class Overriding {
		public static void main(String [] arg)
		{
			C obj =new C();
			obj.display();
		}
}


