package com.security.controller;

import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.Book;
import com.security.entity.Student;
import com.security.service.BookStudentService;

@RestController

public class BookStudentController {
	
	
	@Autowired
	private BookStudentService service;
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student ){
		
		return new ResponseEntity<Student>(service.saveStudent(student),HttpStatus.CREATED);
	}
	
	@PostMapping("/addBook/{studentId}")
	public ResponseEntity<String> addBook(@RequestBody Book book ,@PathVariable int studentId ){ 
		
		service.addBook(book,studentId);
		return new ResponseEntity<String>("added the book succesfully ", HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/showAllBooks/{id}")
	public ResponseEntity<List<Book>> showAllBooks(@PathVariable int id){
		
		return new ResponseEntity<List<Book>>(service.getAllBooks(id),HttpStatus.FOUND);
	}


}

