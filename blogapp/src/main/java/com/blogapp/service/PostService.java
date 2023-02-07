package com.blogapp.service;

import org.springframework.stereotype.Service;

import com.blogapp.payload.PostDto;

public interface PostService {
	
	public PostDto createPost(PostDto postDto);
	

}
