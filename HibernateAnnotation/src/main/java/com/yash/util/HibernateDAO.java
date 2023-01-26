package com.yash.util;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.yash.entity.Actor;

public class HibernateDAO {
public static SessionFactory sessionFactory = null;
static{
	try {
		sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		System.out.println("Session factory Built");
	} catch (Throwable ex) {
		System.err.println("Initial SessionFactory creation failed." + ex);
		throw new ExceptionInInitializerError(ex);
	}
}
	
	public static void main(String[] args) {
	
	Actor actor1 = new Actor();
	actor1.setActorId(201);
	actor1.setFirstName("Mohammad");
	actor1.setLastName("Hassan");
//Insert an actor
 // insertActor(actor1);
//List All Actors
//	listAllActors();
//Delete an Actor
deleteActor(actor1);
//List a Particular Actor
  listActor(201);
	
}

	private static void listActor(int id) {
		Session session = currentSession();
	//	Transaction tx = session.beginTransaction();
		try{
	
			String hql = "Select a FROM Actor AS a "+
			              "Where actorId = :id";
			Query query = session.createQuery(hql);
			query.setParameter("id",id);
			List<Actor> results =  query.list();
			for(Iterator iter =  results.iterator();iter.hasNext();)
			{
				Actor element = (Actor)iter.next();
				System.out.println("-------------------------------------");
				System.out.println("Actor Id: " + element.getActorId());
				System.out.println("First Name: " + element.getFirstName());
				System.out.println("Last Name: " + element.getLastName());
			}
		//	tx.commit();
		} catch(HibernateException e){
			e.printStackTrace();
		//	if (tx != null && tx.isActive())
			//	tx.rollback();
		}
		
		
	}

	private static void deleteActor(Actor actor) {
		System.out.println("Inside Delete Block");
		Session session = currentSession();
//	Transaction tx = session.beginTransaction();
		try{
		//	tx = session.beginTransaction();
			session.delete(actor);
			session.flush();
	//		tx.commit();
		} catch(HibernateException e){
			e.printStackTrace();
		//	if (tx != null && tx.isActive())
		//		tx.rollback();
		}
		
	}

	private static void insertActor(Actor actor) {
		System.out.println("Inside Insert Block");
		Session session = currentSession();
		Transaction tx = session.beginTransaction();
		try{
			
			session.save(actor);
			session.flush();
			tx.commit();
		} catch(HibernateException e){
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
		
		
	}

	private static void listAllActors() {
		
		Session session = currentSession();
		Transaction tx = session.beginTransaction();
		try{
			tx = session.beginTransaction();
			String hql = "Select a FROM Actor AS a";
			Query query = session.createQuery(hql);
			List<Actor> results =  query.list();
			for(Iterator iter =  results.iterator();iter.hasNext();)
			{
				Actor element = (Actor)iter.next();
				System.out.println("-------------------------------------");
				System.out.println("Actor Id: " + element.getActorId());
				System.out.println("First Name: " + element.getFirstName());
				System.out.println("Last Name: " + element.getLastName());
			}
			tx.commit();
		} catch(HibernateException e){
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
		
		
	}
	
	/**
	 * This class provides thread-local variables. These variables differ from
	 * their normal counterparts in that each thread that accesses one (via its
	 * get or set method) has its own, independently initialized copy of the
	 * variable. ThreadLocal instances are typically private static fields in
	 * classes that wish to associate state with a thread (e.g., a user ID or
	 * Transaction ID).
	 * 
	 * For example, in the class below, the private static ThreadLocal instance
	 * (serialNum) maintains a "serial number" for each thread that invokes the
	 * class's static SerialNum.get() method, which returns the current thread's
	 * serial number. (A thread's serial number is assigned the first time it
	 * invokes SerialNum.get(), and remains unchanged on subsequent calls.)
	 * 
	 */
	public static final ThreadLocal session = new ThreadLocal();
	
	public static Session currentSession() throws HibernateException{
		/**
		 * ThreadLocal ThreadLocal.get() Returns the value in the current
		 * thread's copy of this thread-local variable. Creates and initializes
		 * the copy if this is the first time the thread has called this method.
		 */
		Session s = (Session) session.get();
		// Open a new Session, if this thread has none yet
		if(s==null)
		
		{
			System.out.println("Session is null");

			/**
			 * SessionFactory class Creates Sessions. Usually an application has
			 * a single SessionFactory. Threads servicing client requests obtain
			 * Sessions from the factory.
			 * 
			 * sessionFactory_Object.openSession() Create database connection
			 * and open a Session on it.
			 */
			s = sessionFactory.openSession();

			// Store it in the ThreadLocal variable
			session.set(s);
			System.out.println("Session set...");
		}
		return s;
	}
	
}
