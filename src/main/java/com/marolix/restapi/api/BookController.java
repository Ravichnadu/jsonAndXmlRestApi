package com.marolix.restapi.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marolix.restapi.entity.Book;

@RestController
public class BookController {


	@PostMapping( value = "/book", 
			consumes= {"application/xml","application/json"}
	)
	public ResponseEntity<String> addDetails(@RequestBody Book entity)
	{
		System.out.println(entity);
		String msg="Record Saved...!";
		
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/book",
			produces = {"application/xml","application/json"})
	public Book getBook()
	{
		Book b=new Book();
		b.setId(101);
		b.setName("java");
		b.setPrice(3500.00);
		
		return b;
	}
}
