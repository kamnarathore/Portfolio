package com.maping2;

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

    	Trainers tr1= new Trainers();
    	Trainers tr2= new Trainers();
    	Trainers tr3= new Trainers();

    	List<Trainers>list1= new ArrayList();
    	list1.add(tr1);
    	list1.add(tr3);
    	
    	List<Trainers>list2= new ArrayList();
    	list2.add(tr1);
    	list2.add(tr2);
    	
    	List<Trainers>list3= new ArrayList();
    	list3.add(tr2);
    	list3.add(tr3);
    	
    	
    	Subjects sb1= new Subjects();
    	Subjects sb2= new Subjects();
    	Subjects sb3= new Subjects();
    	
    	List<Subjects>ls1= new ArrayList();
    	ls1.add(sb1);
    	ls1.add(sb2);
    	
    	List<Subjects>ls2= new ArrayList();
    	ls2.add(sb3);
    	ls2.add(sb2);
    	
    	List<Subjects>ls3= new ArrayList();
    	ls3.add(sb1);
    	ls3.add(sb3);
       Configuration cfg= new Configuration();
       cfg.configure();
       SessionFactory factory= cfg.buildSessionFactory();
       Session s=factory.openSession();
       tr1.settId(1000);
       tr1.settName("Ayush");
       tr1.setSubjects(ls1);
       
       tr2.settId(1001);
       tr2.settName("Kushal");
       tr2.setSubjects(ls2);
       
       tr3.settId(1003);
       tr3.settName("Shiva");
       tr3.setSubjects(ls3);
       
       sb1.setsId(1111);
       sb1.setsName("java");
       sb1.setTrainers(list1);
       
       sb2.setsId(1112);
       sb2.setsName("Python");
       sb2.setTrainers(list1);
       
       sb3.setsId(1113);
       sb3.setsName("SQL");
       sb3.setTrainers(list1);
       
       Transaction t= s.beginTransaction();
       s.save(tr1);
       s.save(tr2);
       s.save(tr3);
       s.save(sb1);
       s.save(sb2);
       s.save(sb3);
       t.commit();
    }
}
