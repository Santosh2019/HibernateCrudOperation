package com.example.ServiceImplementation;


import com.example.DaoImplementation.StudentDaoImpl;
import com.example.Service.StudentService;
import com.example.bean.Student;

public class StudentServiceImpl implements StudentService{

	
	StudentDaoImpl stuudentDaoImpl=new StudentDaoImpl();
	
	@Override
	public void insert(Student student) {
		
		stuudentDaoImpl.add(student);
		
		
	}

	@Override
	public void update(Student student) {
		stuudentDaoImpl.update(student);
		// TODO Auto-generated method1 stub
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		
		stuudentDaoImpl.delete(student);
		
	}

}
