package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
