package com.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.entity.Book;
import com.security.entity.Student;
import com.security.repository.BookRepo;
import com.security.repository.StudentRepo;

@Service
public class BookStudentService {

	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private StudentRepo studentRepo;

	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	public void addBook(Book book, int id) {
		Student student = studentRepo.findById(id).get();
	student.addNewBook(book);
		studentRepo.save(student);
	}

	public List<Book> getAllBooks(int id) {
		return studentRepo.findById(id).get().getBooks();
	}

}
