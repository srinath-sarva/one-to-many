package com.blogapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapp.payload.PostDto;
import com.blogapp.service.impl.PostServiceImpl;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	@Autowired
	private PostServiceImpl service;
	
	
	@PostMapping
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
		return new ResponseEntity<PostDto>(service.createPost(postDto),HttpStatus.CREATED);
		
	}
	@GetMapping
	public ResponseEntity<List<PostDto>> getAll(){
		return  new ResponseEntity<List<PostDto>>(service.getAll(),HttpStatus.FOUND);
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<PostDto> getById(@PathVariable Long id){ 
		return new ResponseEntity<PostDto>(service.getById(id),HttpStatus.FOUND);
	}
	
	

}
