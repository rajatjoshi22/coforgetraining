package com.bookapp.service;

import java.util.ArrayList;


import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImpl implements BookService {
	ArrayList<Book> bookList = new ArrayList<>();  
	
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookList.add(book);
		System.out.println("Book added Successfully");

	}

	@Override
	public ArrayList<Book> getBookByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Book> authorBookList=new ArrayList<>();
	   for(Book book:bookList) {
		   if((book.getAuthor()).equals(author)) {
			   authorBookList.add(book);
		   }
	   }
	   if(authorBookList.isEmpty()) {
		   throw new BookNotFoundException("No Books Found!No author in record");
	   }
	   
	   
	return authorBookList;
	
	}

	@Override
	public Book getbyId(int bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		 for(Book book:bookList) {
			   if((book.getBookid())==bookid) {
				  return book;
			   }
		   }
		  
	   throw new BookNotFoundException("No Books Found!id wrong");
		   
	}

	@Override
	public ArrayList<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookList;
	}
}
