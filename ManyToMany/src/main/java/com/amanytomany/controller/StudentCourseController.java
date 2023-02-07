package com.amanytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amanytomany.entity.Student;
import com.amanytomany.repository.CourseRepository;
import com.amanytomany.repository.StudentRepo;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
	
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private CourseRepository courserepo;
	
	
	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student  student) {
		
		return studentRepo.save(student);
		
	}
	
	@GetMapping
	public List<Student> findAll() {
		return studentRepo.findAll();
		
	} 
	@GetMapping("/{id}")
	public Student findById(@PathVariable Long id) {
		return studentRepo.findById(id).get();
	}

	
	
	

}
