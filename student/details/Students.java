package org.student.details;

/*
 * Assignment 4
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
 */

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID Number is :" + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is " + id + " and Name is  " + name);
	}

	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student Email is :" + email + " and Phone Number is : " + phoneNumber);
	}

	public static void main(String[] args) {

		Students s = new Students();

		s.getStudentInfo(6053);
		s.getStudentInfo(6053, "David Sagayam");
		s.getStudentInfo("david@gmail.com", "9876543210");

	}

}
