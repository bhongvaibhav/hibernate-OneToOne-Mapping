package com.tybsc.hibernate2_OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();

			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();

        
        Address add1 = new Address(101,"Baramati","Maharashtra","India");
        Employee emp1 = new Employee(11,"ABC","XYZ",5000,add1);
        
        session.save(add1);
        session.save(emp1);
        
        tx.commit();
        
        session.close();
        factory.close();
    }
}
