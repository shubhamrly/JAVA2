package main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hbw.emp;

import org.hibernate.Transaction;
public class M {
   public static void main(String[] args)
{
	Configuration c = new Configuration();
    c.configure("hibernate.cfgheme.xml");
    SessionFactory f = c.buildSessionFactory();
    Session session =f.openSession();
    Transaction t =  session.beginTransaction();
    
   
    emp e = new emp();
    e.setId(1);
    e.setName("Shubham");
    session.save(e);
    System.out.print("done");
    t.commit();
    session.close();
    f.close();
    
}
}
