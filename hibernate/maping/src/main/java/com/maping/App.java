package com.maping;

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
       Employee emp=  new Employee();
       Employee emp1=  new Employee();
       Employee emp2=  new Employee();
       Assest as= new Assest(111, "laptop",emp);
       Assest as1= new Assest(222, "mobile",emp1);
       Assest as2= new Assest(333, "tablet",emp2);
       
    	   Configuration cfg= new Configuration();
    	   cfg.configure();
    	   SessionFactory factory= cfg.buildSessionFactory();
    	   Session s=factory.openSession();
    	   emp.setEmp_id(101);
    	   emp.setName("raj");
    	   emp.setSalary(230000);
    	   emp.setAsset_id(as);
      
    	   emp1.setEmp_id(102);
    	   emp1.setName("raj");
    	   emp1.setSalary(230000);
    	   emp1.setAsset_id(as1);
      
    	   emp2.setEmp_id(103);
    	   emp2.setName("raj");
    	   emp2.setSalary(230000);
    	   emp2.setAsset_id(as2);
      
       Transaction t= s.beginTransaction();
       s.save(emp);
       s.save(emp1);
       s.save(emp2);
       s.save(as);
       s.save(as1);
       s.save(as2);
       t.commit();
    }
}
