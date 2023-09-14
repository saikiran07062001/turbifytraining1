package com.infinite.collections;

public class excep {
	public static void main(String[] arg) {
		try {
			int a = 1 / 0;
		} catch (Exception e) {

			System.out.println(e);
		} finally {
			System.out.println("...");
		}
	}
}

