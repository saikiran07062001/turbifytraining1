
package com.infinite.core;

public class Monday {
	public static void main(String[] args) {
		String a[] = { "monday ", "tuesday", "wednesday", "thursday", "friday", "saturday" };
int j=0;
while(j<=5){
		String e = a[j].toUpperCase();
		char[] b = e.toCharArray();
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i]);
		}
		j++;
		System.out.println(" ");

}
	/*	System.out.println("");
		String f =a[1].toUpperCase();
		char[] c=f.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
System.out.print(c[i]);
	}
		System.out.println(" ");
		String g=a[2].toUpperCase();
		char[] h=g.toCharArray();
		for(int i=h.length-1;i>=0;i--){
			System.out.print(h[i]);
		}*/

}}
