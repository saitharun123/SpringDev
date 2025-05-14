package com.fmc.controller;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fmc.dto.BlogPostDto;
import com.fmc.service.BlogPostService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/posts")
public class BlogPostController {


	private BlogPostService blogPostService;
	
	
	public BlogPostController(BlogPostService blogPostService) {
		super();
		this.blogPostService = blogPostService;
	}
	
	@GetMapping("/page")
	public ResponseEntity<BlogPostDto> getAllBlogs(
			@RequestParam( value= "pageNo", defaultValue = "0",required = false) int pageNo,
			@RequestParam( value = "pageSize", defaultValue = "5",required =false) int pageSize,
			@RequestParam( value = "sortBy", defaultValue = "blogId",required = false) String sortBy,
			@RequestParam( value = "sortDir", defaultValue = "ASC", required = false) String sortDir)
	{
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
		PageRequest page = PageRequest.of(pageNo, pageSize, sort);
		List<BlogPostDto> blogList = blogPostService.findAll(page);
		return new ResponseEntity(blogList, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<BlogPostDto> createBlog(@Valid @RequestBody BlogPostDto body){
		BlogPostDto blogDto = blogPostService.createBlogPost(body);
		
		ResponseEntity<BlogPostDto> response = new ResponseEntity(blogDto,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/{postId}")
	public ResponseEntity<BlogPostDto> findBlogById(@PathVariable("postId")int postId){
		BlogPostDto blogDto = blogPostService.findByBlogPostId(postId);
		return new ResponseEntity(blogDto,HttpStatus.FOUND);
	}
	
	@GetMapping
	public ResponseEntity<List<BlogPostDto>> findAllBlogs(){
		List<BlogPostDto> blogList = blogPostService.findAll();
		return new ResponseEntity(blogList,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<BlogPostDto> updateBlogPost(@Valid @RequestBody BlogPostDto dto){
		BlogPostDto blog = blogPostService.updateBlogPost(dto);
		return new ResponseEntity(blog,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{postId}")
	public ResponseEntity<String> deleteBlogPostById(@PathVariable Integer postId){
		blogPostService.deleteBlogPostById(postId);
		return new ResponseEntity("Deleted Successfully",HttpStatus.NO_CONTENT);
	}
	
	
}

