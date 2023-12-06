package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg= new Configuration();
    	cfg.configure();
    	SessionFactory factory= cfg.buildSessionFactory();
    	Session s= factory.openSession();
//    	Bike b= new Bike(234,"Hero", 200000);
//    	Bike b1= new Bike(233,"pulsur", 500000);
    	Transaction t= s.beginTransaction();
//    	System.out.println(b.getCost());
//    	System.out.println(b.getBrand());
//    	System.out.println(b.getModelnum());
//    	System.out.println(b1.getCost());
//    	System.out.println(b1.getBrand());
//    	System.out.println(b1.getModelnum());
//    	s.save(b);
//    	s.save(b1);
    	Bike b=s.get(Bike.class, 234);
    	System.out.println(b);
    	t.commit();
    }
}
