package com.infinite.business;

import java.util.Set;

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private String className;
	private String rollNo;
	private int age;
	private Set subjects;

	public Student() {
		// super();
	}

	public Student(String firstName, String lastName, String className, String rollNo, int age) {
		// super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.className = className;
		this.rollNo = rollNo;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set getSubjects() {
		return subjects;
	}

	public void setSubjects(Set subjects) {
		this.subjects = subjects;
	}

}
