package com.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student200")
public class Student {
	@Id
	@Column(name="sid")
private int studentId;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
@Column(name="sname",length=20)
private String studentName;
@Column(name="grp",length=10)
private String group;
}
