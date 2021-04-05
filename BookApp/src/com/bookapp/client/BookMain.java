package com.bookapp.client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.bookapp.service.*;
import com.bookapp.model.Book;
public class BookMain {
public static void main(String[] args) {
	
	BookService bookserve=new BookServiceImpl();
	Scanner src=new Scanner(System.in);
	for(int counter=0;counter<3;counter++) {
		System.out.println("Enter title for book"+(counter+1));
		String title=src.next();
		System.out.println("Enter Author name");
		String author=src.next();
		System.out.println("Enter Book id");
		int bookid=src.nextInt();
		System.out.println("Enter Book Category");
		String category=src.next();
		Book book=new Book(title,author,bookid,category);
		bookserve.addBook(book);
	}
	ArrayList<Book> allbooks=bookserve.getAllBooks();
	for(Book book:allbooks)
		System.out.println(book);
	try {
	System.out.println("Enter the author name to search books");
	String author=src.next();
	ArrayList<Book> authorBookList=bookserve.getBookByAuthor(author);	
	Collections.sort(authorBookList, (o1,o2) -> {return o1.getTitle().compareTo(o2.getTitle());} );
	for(Book book:authorBookList)
		System.out.println(book);
	}catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
try {
	System.out.println("Enter bookid to search book");
	int bookid=src.nextInt();
	Book bok1=bookserve.getbyId(bookid);
	System.out.println(bok1);
	}catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}finally {
		src.close();
	}
}
}
