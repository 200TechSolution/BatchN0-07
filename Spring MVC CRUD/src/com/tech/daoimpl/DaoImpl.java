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
		session.saveOrUpdate(stu);
		tx.commit();

		session.close();

		return "Student ID: " + stu.getSid() + " Saved Successfully";
	}

	@Override
	public List<Student> getStudent(String userName, String Password) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query q = session.createQuery("from Student where userName=:user and password=:pass");
		q.setParameter("user", userName);
		q.setParameter("pass", Password);
		List studentList = q.getResultList();
		tx.commit();
		session.close();

		return studentList;
	}

	@Override
	public List<Student> getAllStudents() {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("from Student");
		List slist = q.getResultList();
		return slist;
	}

	@Override
	public String deleteStudent(String id) {
		Session session = sf.openSession();
		Student stu = session.get(Student.class, id);
		session.delete(stu);
		Transaction tx = session.beginTransaction();
		tx.commit();

		return "Student Id:"+stu.getSid() +"Deleted Successfully";
	}

	@Override
	public Student editData(String id) {
		Session session=sf.openSession();
		
		 Student stu=session.get(Student.class,id);
		 session.update(stu);
		 session.beginTransaction().commit();
		return stu;
	}

}
