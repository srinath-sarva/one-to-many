package com.blogapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.blogapp.entity.Post;
import com.blogapp.payload.PostDto;
import com.blogapp.repository.PostRepository;
import com.blogapp.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepo;
	
	@Override
	public PostDto createPost(PostDto postDto) {
		Post post = new Post();
		post.setTitle(postDto.getTitle() );
		post.setContent(postDto.getContent());
		post.setDescription(postDto.getDescription());
		
		Post newPost=postRepo.save(post);
		PostDto postResponse= new PostDto();
		postResponse.setId(newPost.getId());
		postResponse.setTitle(newPost.getTitle());
		postResponse.setDescription(newPost.getDescription());
		postResponse.setContent(newPost.getContent());
		return postResponse;
		
	}

	public List<PostDto> getAll() {
		// TODO Auto-generated method stub
		List<Post> posts= postRepo.findAll();
		List<PostDto> postDtos= new ArrayList<>();
		postDtos=posts.stream().map(t -> mapToPostDto(t) ).collect(Collectors.toList());
		return postDtos;
	}
	
	public PostDto mapToPostDto( Post post) {
		
		PostDto postDto=new PostDto(post.getId(),post.getTitle(),post.getDescription(),post.getContent());
		return postDto;
		
	}

	public PostDto getById(Long id) {
		// TODO Auto-generated method stub
		return mapToPostDto(postRepo.findById(id).get());
	}
	
}
