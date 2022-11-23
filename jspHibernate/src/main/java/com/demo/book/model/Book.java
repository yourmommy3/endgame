package com.demo.book.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Book {

 @Id
 @Column(name="BOOK_ID")
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private long bookId;
 
 @Column(name = "BOOK_TITLE")
    private String bookTitle;

    
    @Column(name = "BOOK_PRICE")
    private BigDecimal bookPrice;

    @Column(name = "BOOK_AUTHOR")
    private String bookAuthor;

 public Book(long bookId, String bookTitle, BigDecimal bookPrice, String bookAuthor) {
  super();
  this.bookId = bookId;
  this.bookTitle = bookTitle;
  this.bookPrice = bookPrice;
  this.bookAuthor = bookAuthor;
 }

 public long getBookId() {
  return bookId;
 }

 public void setBookId(long bookId) {
  this.bookId = bookId;
 }

 public String getBookTitle() {
  return bookTitle;
 }

 public void setBookTitle(String bookTitle) {
  this.bookTitle = bookTitle;
 }

 public BigDecimal getBookPrice() {
  return bookPrice;
 }

 public void setBookPrice(BigDecimal bookPrice) {
  this.bookPrice = bookPrice;
 }

 public String getBookAuthor() {
  return bookAuthor;
 }

 public void setBookAuthor(String bookAuthor) {
  this.bookAuthor = bookAuthor;
 }
 
 public Book() {
  // TODO Auto-generated constructor stub
 }
 
}