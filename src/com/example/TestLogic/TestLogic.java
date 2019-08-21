package com.example.TestLogic;

import com.example.ServiceImplementation.StudentServiceImpl;
import com.example.bean.Student;

public class TestLogic {

	public static void main(String[] args) {

		StudentServiceImpl service = new StudentServiceImpl();

		Student student1 = new Student("Santosh", "10", "9552231581", "Pune");
		Student student2 = new Student("Hemant", "11", "9325691241", "Galgaon");

		Student student3 = new Student("Prerana", "12", "8446796434", "Satara");
		Student student4 = new Student("Ashutosh", "13", "8825691228", "Delhi");

		Student student5 = new Student("Hema", "14", "9325691241", "Patna");
		Student student6 = new Student("Ganesh", "15", "772569892", "Nanded");

		Student student7 = new Student("Dynashwer", "16", "9355691241", "Pune");
		Student student8 = new Student("Santosh", "17", "9325691241", "Goa");

		Student student9 = new Student("Uday", "18", "9325691241", "Banglore");
		Student student10 = new Student("Rohan", "19", "8325691111", "Noida");

		service.insert(student1);
		service.insert(student2);
		
		service.insert(student3);
		service.insert(student4);
		
		service.insert(student5);
		service.insert(student6);

		service.insert(student7);
		service.insert(student8);
		
		service.insert(student9);
		service.insert(student10);
		
		System.out.println("\t\tDeleted Record");
		service.delete(student10);
		System.out.println("\t\tBefore Updated Record");
		student9.setStudentName("Khiliji");
		service.update(student9);
		System.out.println("\t\tAfter Updated Record");
		
		
		
	}

}
