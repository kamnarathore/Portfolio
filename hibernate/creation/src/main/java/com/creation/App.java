package com.creation;

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
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session s=factory.openSession();
       Laptop lappi=new Laptop(21, "HP");
       Student stue= new Student(1, "raj");
       Transaction t= s.beginTransaction();
       s.save(lappi);
       s.save(stue);
       t.commit();
    }
}
