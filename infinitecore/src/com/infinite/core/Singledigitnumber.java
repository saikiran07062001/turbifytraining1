//@sai kiran
package com.infinite.core;

public class Singledigitnumber {
	public static void main(String[] args) {
		int a = 0, b = 10;
		int c = 3; // initialized c variable
		if (c >= a && c < b)// comparing c with a and b to check single digit or
							// not
		{
			System.out.println("enter digit is single " + c);
		} else {
			System.out.println("enter digit is not a single digit " + c);
		}
	}
}
