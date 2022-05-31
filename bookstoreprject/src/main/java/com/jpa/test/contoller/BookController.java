package com.jpa.test.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.entities.Book;

@RestController
public class BookController {
	
	//RequestMapping(value="/books",method= RequestMethod.GET)
	
	@GetMapping("/books")
	
	public Book getbooks()
	{
		Book book=new Book();
		book.setId(2);
		book.setTitle("Java Book");
		book.setAuthor("ABC");
		return book;
	}

}
