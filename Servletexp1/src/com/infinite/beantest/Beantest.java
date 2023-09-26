package com.infinite.beantest;

import java.util.Date;

import com.infinite.beans.User;

public class Beantest {
public static void main(String[] args){
	User sai=new User();
	sai.setUsername("sai kiran");
	sai.setPassword("nithin passionate coder@520");
	sai.setLogindate( new Date());
	sai.Display();
	System.out.println(sai.getUsername());
}
}
