package com.maping1;



import java.util.ArrayList;
import java.util.List;

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
    	Laptop l1= new Laptop();
    	Laptop l2= new Laptop();
    	Laptop l3= new Laptop();
    	Laptop l4= new Laptop();
    	List<Laptop>list1= new ArrayList();
    	list1.add(l1);
    	list1.add(l2);
    	List<Laptop>list2= new ArrayList();
    	list2.add(l3);
    	list2.add(l4);
    	Employee emp= new Employee(105, "Raj", 123000, list1);
    	Employee emp1= new Employee(106, "Muskan", 123000, list2);
    	l1.setModelnum(111);
    	l1.setBrand("Lenovo");
    	l1.setEmp(emp1);
    	
    	l2.setModelnum(222);
    	l2.setBrand("HP");
    	l2.setEmp(emp1);
    	
    	
    	l3.setModelnum(333);
    	l3.setBrand("dell");
    	l3.setEmp(emp);
    	
    	
    	l4.setModelnum(444);
    	l4.setBrand("Apple");
    	l4.setEmp(emp);
    	
    	
    	Configuration cfg= new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session s=factory.openSession();
    	Transaction t= s.beginTransaction();
    	s.save(l1);
    	s.save(l2);
    	s.save(l3);
    	s.save(l4);
    	s.save(emp);
    	s.save(emp1);
//    	s.save(list1);
//    	s.save(list2);
    	t.commit();
    	
    	
    }
}
