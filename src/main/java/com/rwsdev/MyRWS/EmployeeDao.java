package com.rwsdev.MyRWS;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public Employee getEmployeeById(int id){
		Employee emp = null;
		Session session = null;
		try{
			session = sessionFactory.openSession();
			session.beginTransaction();
			emp = (Employee) session.createQuery("from Employee e where e.id = :ID").setParameter("ID", id).
					uniqueResult();
			session.getTransaction().commit();
		}
		catch(Exception ex){
			if(session != null){
				session.getTransaction().rollback();
			}
		}
		finally{
			if(session != null){
				session.close();
			}
		}
		return emp;
	}

	/* Start - Code to return all employees from DB*/
	
	public List<Employee> getAllEmployees(){
		List<Employee> emp = null;
		Session session = null;
		try{
			session = sessionFactory.openSession();
			session.beginTransaction();
			emp = session.createQuery("from Employee e").list();
			session.getTransaction().commit();
		}
		catch(Exception ex){
			if(session != null){
				session.getTransaction().rollback();
			}
		}
		finally{
			if(session != null){
				session.close();
			}
		}
		return emp;
	}

	
}
