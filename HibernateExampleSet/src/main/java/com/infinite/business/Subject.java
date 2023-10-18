package com.infinite.business;

public class Subject {
private int subjectId;
private String SubjectName;
public Subject(){
	
}
public Subject(String subjectName) {
	//super();
	SubjectName = subjectName;
}
public int getSubjectId() {
	return subjectId;
}
public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}
public String getSubjectName() {
	return SubjectName;
}
public void setSubjectName(String subjectName) {
	SubjectName = subjectName;
}

}
