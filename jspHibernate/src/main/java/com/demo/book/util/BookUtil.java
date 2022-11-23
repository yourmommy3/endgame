package com.demo.book.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.demo.book.model.Book;

public class BookUtil {
 
 private static SessionFactory sessionFactory;
 
 public static SessionFactory getSessionFactory() {
  if(sessionFactory==null) {
   Configuration configuration=new Configuration();
   configuration.configure("hibernate.cfg.xml");
    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
      applySettings(configuration.getProperties()).build();
    
    configuration.addAnnotatedClass(Book.class);
    
    sessionFactory=configuration.buildSessionFactory(serviceRegistry);
    
    
  }
  return sessionFactory;
 }
 
}