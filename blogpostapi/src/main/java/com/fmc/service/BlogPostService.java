package com.fmc.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.fmc.dto.BlogPostDto;
import com.fmc.entity.BlogPost;

public interface BlogPostService {

	BlogPostDto createBlogPost(BlogPostDto blogDto);
	
	BlogPostDto findByBlogPostId(Integer id);
	
	List<BlogPostDto> findAll();
	
	BlogPostDto updateBlogPost(BlogPostDto dto);

	List<BlogPostDto> findAll(PageRequest page);
	
	void deleteBlogPostById(Integer id);
}
