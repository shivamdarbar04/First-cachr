package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.MavenProject2.Address;

public class FirstCache 
{
  public static void main(String[] args) 
  {
	 
	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 Session session = factory.openSession();
	 
	 Address address = session.get(Address.class, 1);
	 System.out.println(address);
	 
	 System.out.println("Working sosmething");
	 
	 Address address2 = session.get(Address.class, 1);
	 System.out.println(address2);
	 
	 System.out.println(session.contains(address2));
	 
	 session.close();
  }
}
