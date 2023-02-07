package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
