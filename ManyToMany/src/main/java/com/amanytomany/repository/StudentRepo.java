package com.amanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amanytomany.entity.Student;

public interface StudentRepo  extends JpaRepository<Student,Long >{

	
}
