package com.demo.book.controller;

import java.io.IOException;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.demo.book.dao.BookDAO;
import com.demo.book.model.Book;

/**
 * Servlet implementation class BookController
 */
@WebServlet("/BookController")
public class BookController extends HttpServlet {

 private static final Logger LOGGER = Logger.getLogger(BookController.class);

 public BookController() {
   }

 protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
  String flag = request.getParameter("flag");

  handleRequestUsingFlag(request, response, flag);
 }

 private void handleRequestUsingFlag(HttpServletRequest request, HttpServletResponse response, String flag)
   throws ServletException, IOException {

  BookDAO bookDAO = new BookDAO();

  if ("editBook".equalsIgnoreCase(flag)) {
   long bookId = Long.valueOf(request.getParameter("bookId"));
   Book book = bookDAO.findBookByBookId(bookId);
   request.setAttribute("book", book);
   request.getRequestDispatcher("add_book.jsp").forward(request, response);
  } else if ("deleteBook".equalsIgnoreCase(flag)) {
   String bookId = request.getParameter("bookId");
   if (bookId != "") {
    bookDAO.deleteBookById(Long.valueOf(bookId));
   }
   List<Book> books = bookDAO.findAllBooks();
   request.setAttribute("books", books);
   request.getRequestDispatcher("view_books.jsp").forward(request, response);
  } else {
   List<Book> books = bookDAO.findAllBooks();
   request.setAttribute("books", books);
   request.getRequestDispatcher("view_books.jsp").forward(request, response);
  }
 }

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
  BookDAO bookDAO = new BookDAO();

  BigDecimal bookPrice = new BigDecimal(request.getParameter("bookPrice"));
  String bookTitle = request.getParameter("bookTitle");
  String bookAuthor = request.getParameter("bookAuthor");
  String bookId = request.getParameter("bookId");

  Book book = new Book();
  book.setBookAuthor(bookAuthor);
  book.setBookPrice(bookPrice);
  book.setBookTitle(bookTitle);
  if (bookId != "" && Long.valueOf(bookId) > 0) {
   book.setBookId(Long.valueOf(bookId));
  }

  bookDAO.addUpdateBook(book);

  handleRequestUsingFlag(request, response, "viewBooks");

 }

}