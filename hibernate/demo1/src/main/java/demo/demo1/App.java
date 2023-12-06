package demo.demo1;

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
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session s=factory.openSession();
       Employee e1=new Employee(4, "ritu", 3450000);
       Employee e2=new Employee(5, "raj", 450000);
       Employee e3=new Employee(6, "muskan", 4500000);
       

       Transaction t=s.beginTransaction();
    s.save(e1);
    s.save(e2);
    s.save(e3);
       t.commit();
       
       
    }
}
