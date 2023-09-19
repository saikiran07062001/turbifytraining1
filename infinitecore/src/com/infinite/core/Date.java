package com.infinite.core;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Date {
	public static void main(String[] codder){
	String date = "2023-09-19";
	Date obj = new Date();
	obj.dateonly();

	display(date);
}


	void dateonly() {
		LocalDate local = LocalDate.now();
		System.out.println("Date:            " + local);
	}

	static void display(String date) {
		LocalDate local = LocalDate.parse(date);
		int day = local.getDayOfMonth();
		DayOfWeek dayofweek = local.getDayOfWeek();
		Month month = local.getMonth();
		int year = local.getYear();
		System.out.println("Day            :       " + day);
		System.out.println("Day of the week:       " + dayofweek);
		System.out.println("month          :       " + month);
		System.out.println("year           :       " + year);
	}
}
