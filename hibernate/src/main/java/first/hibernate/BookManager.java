package first.hibernate;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
    protected SessionFactory sessionFactory;
 
    protected void setup() {
     final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
     try {
         sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
     } catch (Exception ex) {
         System.out.println(ex); 
     }
    }
 
    
    protected void create() {
     book book = new book();
     	book.setTitle("DS");
        book.setAuthor("satay");
        book.setPrice(100);
     
        Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.save(book);
     
        session.getTransaction().commit();
        session.close();
    }
  protected void alter()
  {
	  
  }
    protected void read() {
     Session session = sessionFactory.openSession();
      
        long bookId = 1;
        book book = session.get(book.class, bookId);
     
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
     
        session.close();
    }
 
    protected void update() {
     book book = new book();
        book.setId(2);
        book.setTitle("AI");
        book.setAuthor("dev");
        book.setPrice(4.9f);
     
        Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.update(book);
     
        session.getTransaction().commit();
        session.close();
    }
 
    protected void delete() {
      book book = new book();
         book.setId(1);
      
         Session session = sessionFactory.openSession();
         session.beginTransaction();
      
         session.delete(book);
         System.out.println("Deleted");
         session.getTransaction().commit();
         session.close();
    }
    
    
    protected void exit() {
    sessionFactory.close();
    }
 
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.setup();
        @SuppressWarnings("resource")
  Scanner myInput = new Scanner( System.in );
        int choice;
        
        System.out.print( "Enter your choice: " );
        choice= myInput.nextInt();
        
        switch (choice)
        {
        case 1:
         manager.create();
            break;
        case 2:
         manager.read();
            break;
        case 3:
         manager.update();
            break;
        case 4:
            manager.delete();
            break;
             default:
          System.out.println("invalid option");
          
        }
        
        manager.exit();
           
    } 
      
    }
