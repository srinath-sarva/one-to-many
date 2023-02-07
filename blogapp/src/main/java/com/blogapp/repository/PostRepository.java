package com.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogapp.entity.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
