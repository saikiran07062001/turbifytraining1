package com.infinite.business;

import java.util.HashSet;

import com.infinite.persistence.StudentDBOperations;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet subjectSet1 = new HashSet();
		subjectSet1.add(new Subject("Data Structure"));
		subjectSet1.add(new Subject("Operting System"));

		HashSet subjectSet2 = new HashSet();
		subjectSet2.add(new Subject("Compier"));
		subjectSet2.add(new Subject("Networking"));
		subjectSet2.add(new Subject("DBMS"));

		//Create the student object.
		Student student1 = new Student("Sam", "Kolaparthi", 
				"MCA final", "MCA/07/1902", 27);		
		Student student2 = new Student("Sunil", "Yash", 
				"MCA final", "MCA/07/2023", 32);

		student1.setSubjects(subjectSet1);
		student2.setSubjects(subjectSet2);

		StudentDBOperations obj = new StudentDBOperations();
		//insert student object.
		obj.addStudent(student1);
		obj.addStudent(student2);

		//show all student object.
		obj.showAllStudentDetails();	
	}

}
