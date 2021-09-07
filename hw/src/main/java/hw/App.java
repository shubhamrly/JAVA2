package hw;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String [] args)
{
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tn=session.beginTransaction();
    Emp e = new Emp();
    e.setEid(1);
    e.setName("Shubham");
	e.setSalary(100);
	session.save(e);
    tn.commit();
    System.out.println("done");
}
}
