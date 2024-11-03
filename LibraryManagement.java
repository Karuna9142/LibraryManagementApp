package com.demo;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class LibraryManagement 
{
  public void create()
  {
	    Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
	
		Book b1 = new Book();
		b1.setB_id(2345); b1.setB_title("The Great Gatsby"); b1.setB_price(500.0);
		
		Book b2 = new Book();
		b2.setB_id(2346); b2.setB_title("The Hobbit"); b2.setB_price(300.0);
		
		Book b3 = new Book();
		b3.setB_id(2347); b3.setB_title("The Crime And Punishment"); b3.setB_price(400.0);
		
		Book b4 = new Book();
		b4.setB_id(2348); b4.setB_title("War and Piece"); b4.setB_price(100.0);
		
		User u1 = new User();
		u1.setUid(12346); u1.setUname("Rohit"); u1.setEmail("roh123@gmail");u1.setAddress("Piskamore"); u1.setNo_of_book(2);
		
		User u2 = new User();
		u2.setUid(52346); u2.setUname("Geeta"); u2.setEmail("gita123@gmail");u2.setAddress("Pune"); u2.setNo_of_book(1);
		
		User u3 = new User();
		u3.setUid(52346); u3.setUname("Geeta"); u3.setEmail("gita123@gmail");u3.setAddress("Pune"); u3.setNo_of_book(1);
		
		User u4 = new User();
		u4.setUid(52346); u4.setUname("Geeta"); u4.setEmail("gita123@gmail");u4.setAddress("Pune"); u4.setNo_of_book(1);
		
		Loan l1 = new Loan();
		l1.setId(4); l1.setBook(b1); l1.setBook(b2); l1.setBook(b3); l1.setBook(b4);
		
		l1.setUser(u1); l1.setUser(u2); l1.setUser(u3); l1.setUser(u4);
		l1.setLoandate("2024-11-04");l1.setReturndate("2024-11-10");	
		
		s.save(b1); s.save(b2); s.save(b3); s.save(b4);
		s.save(u1); s.save(u2); s.save(u3); s.save(u4);
		
	    s.save(l1);
		
		t.commit();
		s.close();
  }
  public void update()
  {
	  /*
	   String hql = "update Employee set age = :a where id = :k";
		Query q = sess.createQuery(hql);
		q.setParameter("a", 24);
		q.setParameter("k", 101);
		
		int row = q.executeUpdate();
		System.out.println(row+ " Object is updated");
	   */
	        Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			
			Transaction t = s.beginTransaction();
			
			String hql = "update Book set b_title = :a where b_Id = :k";
			Query q = s.createQuery(hql);
			q.setParameter("a", "Brave new world"); 
			q.setParameter("k", 4); 
			
			int row = q.executeUpdate();
			System.out.println(row+ " Object is updated"); 
			
			t.commit();
			s.close();
			
  }
  public void read_data()
  {

      Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		String hql = "from Book";
		Query q = s.createQuery(hql);
		List<Book> bk = q.getResultList();
		
		System.out.println("Book Details");
		for(Book b:bk)
		{
			System.out.println(b.getB_id());
			System.out.println(b.getB_title());
			System.out.println(b.getB_price());
		}
		
		t.commit();
		s.close();
  }
  public void delete_data()
  {

      Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		String hql = "delete from Book where B_price = :p";
		Query q = s.createQuery(hql);
		q.setParameter("p", 100);
		
		
		int del = q.executeUpdate();
		System.out.println(del+ " Object is Deleted"); 
		
		t.commit();
		s.close();
  }
  
	public static void main(String[] args)
	{
	LibraryManagement lib = new LibraryManagement();
	//lib.create();
	//lib.update();
	lib.read_data();
	
	//lib.delete_data();
	}

}
