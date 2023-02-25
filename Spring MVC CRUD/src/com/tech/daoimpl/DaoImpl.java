package com.tech.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.daoi.DaoI;
import com.tech.model.Student;

@Repository
public class DaoImpl implements DaoI {

	@Autowired
	SessionFactory sf;

	@Override
	public String saveData(Student stu) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String s = (String) session.save(stu);
		tx.commit();

		session.close();

		return "Student ID: " + stu.getSid() + " Saved Successfully";
	}

	@Override
	public List<Student> getStudent(String userName, String Password) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query q = session.createQuery(
				"from Student where userName=:user and password=:pass");
		q.setParameter("user", userName);
		q.setParameter("pass", Password);
		List studentList = q.getResultList();
		tx.commit();
		session.close();

		return studentList;
	}

}
