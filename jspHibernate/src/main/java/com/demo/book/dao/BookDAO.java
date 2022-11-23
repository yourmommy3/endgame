package com.demo.book.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.book.model.Book;
import com.demo.book.util.BookUtil;

public class BookDAO {

 public void addUpdateBook(Book book) {

  SessionFactory sessionFactory = BookUtil.getSessionFactory();
  Session session = sessionFactory.openSession();
  Transaction transaction = session.beginTransaction();
  session.saveOrUpdate(book);
  transaction.commit();
  session.close();

 }

 public List<Book> findAllBooks() {
  SessionFactory sessionFactory = BookUtil.getSessionFactory();
  Session session = sessionFactory.openSession();
  return session.createQuery("from Book", Book.class).getResultList();
 }

 public Book findBookByBookId(long bookId) {
  SessionFactory sessionFactory = BookUtil.getSessionFactory();
  Session session = sessionFactory.openSession();
  return session.find(Book.class, bookId);

 }

 public void deleteBookById(long bookId) {
  Book book = findBookByBookId(bookId);
  SessionFactory sessionFactory = BookUtil.getSessionFactory();
  Session session = sessionFactory.openSession();
  Transaction transaction = session.beginTransaction();
  session.delete(book);
  transaction.commit();
  session.close();

 }

}