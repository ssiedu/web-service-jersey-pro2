package com.ssi.firstws;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CourseDAO {

	private SessionFactory sessionFactory;
	
	public CourseDAO(){
		Configuration config=new Configuration().configure();
		sessionFactory=config.buildSessionFactory();
	}
	
	public List<Course> getAllCourses(){
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Course.class);
		List<Course> courses=criteria.list(); 
		session.close();
		return courses;
	}
	public Course searchCourseById(int code){
		Session session=sessionFactory.openSession();
		Course course=session.get(Course.class, code);
		session.close();
		return course;
	}
	public Course addOrModifyCourse(Course course){
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(course);
		tr.commit();
		session.close();
		return course;
	}
	
	
	
	
	
}
