package com.amanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amanytomany.entity.Course;

public interface CourseRepository  extends  JpaRepository<Course, Long>{
	
	

}
