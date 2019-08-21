package com.example.DaoImplementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.Dao.StudentDao;
import com.example.bean.Student;

public class StudentDaoImpl implements StudentDao {

	SessionFactory sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();

	Session session = sessionFactory.openSession();
	

	@Override
	public void add(Student student) {
		Transaction tn = session.beginTransaction();
		session.save(student);
		session.flush();
		tn.commit();
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		Transaction tn1 = session.beginTransaction();
		
		session.update(student);
		session.flush();
		tn1.commit();

	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		Transaction tn1 = session.beginTransaction();
		
		session.delete(student);
		session.flush();
		tn1.commit();

		
		
	}

}
