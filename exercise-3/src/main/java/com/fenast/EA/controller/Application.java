package com.fenast.EA.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fenast.EA.model.Book;
import com.fenast.EA.model.Course;
import com.fenast.EA.model.Customer;
import com.fenast.EA.model.Department;
import com.fenast.EA.model.Employee;
import com.fenast.EA.model.Office;
import com.fenast.EA.model.Publisher;
import com.fenast.EA.model.Reservation;
import com.fenast.EA.model.Student;

public class Application {
	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new Configuration();
			
			// This step will read hibernate.cfg.xml
			sessionFactory = configuration.configure().buildSessionFactory();
			
		} catch(Throwable ex) {
			System.err.println(ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void main(String[] args) {
		Session session = null;
		Transaction tx = null;
		
		try {
			Department department = new Department("Computer Science");
			
			List<Employee> employlist = new ArrayList<Employee>();
			employlist.add(new Employee("Eyuel", new Department("Computer Science"), new Office(200, 5)));
			employlist.add(new Employee("John", new Department("Law"), new Office(100, 3)));
			employlist.add(new Employee("Tom", new Department("Maths"), new Office(101,4)));

			department.setEmployees(employlist);
			//=================== Book =====================
			Book b1 = new Book("Harry Poter","JkRowling");
			Publisher p1 = new Publisher("Addis Press");
			
			//================== Student =====================
			Student s1 = new Student("Eyuel", "Taddese");
			List<Course> course = new ArrayList<Course>();
			course.add(new Course(544, "Enterprise Architecture"));
			course.add(new Course(467,"Algorithm"));
			course.add(new Course(454,"WAP"));
			s1.setCourses(course);
			
			//================= Customer =====================
			Customer c1 = new Customer("Hiab");
			
//			List<Reservation> reservations = new ArrayList<Reservation>();
//			reservations.add(new Reservation("2008-11-11"));
//			
//			c1.setReservations(reservations);
//			
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			// Save Department
			session.persist(department);
			//Save Book
			session.persist(b1);
			session.persist(p1);
			//Save Student 
			session.persist(s1);
			//Save Customer
			session.persist(c1);
			
			tx.commit();
			System.out.println("Over");
			
		} catch (HibernateException e) {
			System.err.println(e);
			if(tx != null) tx.rollback();
		} finally {
			if(session != null) session.close();
		}
		
		//================= Another Session ====================
		try {
			session = sessionFactory.openSession();
			
			tx = session.beginTransaction();
//			List<Student> students = session.createQuery("from sutdent s order by s.firstName desc").list();
//			
//			for(Student student : students) {
//				
//			}
		} catch(HibernateException e) {
			System.err.println(e);
			if(tx != null) tx.rollback();
		} finally {
			if(session != null) session.close();
		}
	}
}
