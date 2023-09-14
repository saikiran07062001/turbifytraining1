//@sai kiran
package com.infinite.core;

public class Numalp {// printing number and alphabet series 1a 2a 3a...26z
	public static void main(String[] args) {
		int i = 1;// initialising number 
		int j = 97;// initialising alphabet by using ASCII Value

		while (i <= 26) {// checking conditons for i
			System.out.print(i+""+(char)j+" ");// printing the series
			i++;// incrementing number
			j++;// incrementing alphabet
		}

	}

}
