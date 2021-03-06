package com.bookapp.service;

import java.util.ArrayList;


import com.bookapp.exceptions.*;
import com.bookapp.model.Book;

public interface BookService {
	void addBook(Book book);
	ArrayList<Book> getBookByAuthor(String author) throws BookNotFoundException;
	Book getbyId(int bookid)throws BookNotFoundException;
	ArrayList<Book> getAllBooks();
}
