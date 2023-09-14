//@sai kiran
package com.infinite.core;

public class Palindrome {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 4) {
			System.out.print(i + " ");
			i++;
			if (i == 5) {
				continue;
			}

		}
		while (i > 1) {
			i--;
			System.out.print(i + " ");
		}
	}

}
