package org.student;

/*
 * Assignment2
=============
     Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.
 */

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name : Ashok kumar");
	}

	public void studentDept() {
		System.out.println("Department : ECE");

	}

	public void studentId() {
		System.out.println("ID : 6053");

	}

	public static void main(String[] args) {

		Student st = new Student();

		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		System.out.println("********************************************");
		st.studentDept();
		st.studentId();
		st.studentName();
		System.out.println("*********************************************");
		st.deptName();
	}
}
