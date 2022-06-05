package com.jpa.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.jpa.test.entities.*;

@Component
public class BookService {
	
	private static List<Book> list=new ArrayList<>();
	
	static
	{
		list.add(new Book(11,"python","ancd"));
		list.add(new Book(16,"SpringBoot","raju"));
		list.add(new Book(17," developer","bnhd"));
		list.add(new Book(13,"English","Suresh"));
	}
	
	public List<Book> getAllBook()
	{
		return list;
	}
	public Book getBookById(int id)
	{
		Book book=null;
		try {
			 book = list.stream().filter(e->e.getId()==id).findFirst().get();
		}
		catch(Exception e)
		{
			System.out.println("Exception" +e);
		}
		return book;
		
		
	}
	public Book setBook(Book book)
	{
		list.add(book);
		return book;
	}
	public void deleteBook(int id)
	{
		list=list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
	}
    
	public void updateBook(Book book,int id)
	{
//		for(Book b:list)
//		{
//			if(b.getId()==id)
//			{
//				b.setAuthor(book.getAuthor());
//				b.setTitle(book.getTitle());
//			}
//		
		list=list.stream().map(b->{
			
			if(b.getId()==id)
			{
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
	}

}
