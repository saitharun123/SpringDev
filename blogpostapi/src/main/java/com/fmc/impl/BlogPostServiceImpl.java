package com.fmc.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.fmc.dto.BlogPostDto;
import com.fmc.entity.BlogPost;
import com.fmc.exception.ResourceNotFoundException;
import com.fmc.repository.BlogPostRepository;
import com.fmc.repository.CommentRepository;
import com.fmc.service.BlogPostService;

@Service
public class BlogPostServiceImpl implements BlogPostService{

    private final CommentRepository commentRepository;

	private BlogPostRepository blogPostRepo;
	
	public BlogPostServiceImpl(BlogPostRepository blogPostRepo, CommentRepository commentRepository) {
		super();
		this.blogPostRepo = blogPostRepo;
		this.commentRepository = commentRepository;
	}


	@Override
	public BlogPostDto createBlogPost(BlogPostDto blogDto) {
		BlogPost blogPost = blogPostRepo.save(mapDtoToEntity(blogDto));
		
		return mapEntityToDto(blogPost);
	}
	
	private BlogPost mapDtoToEntity(BlogPostDto blogPostDto) {
		BlogPost blogPost = new BlogPost();
		blogPost.setContent(blogPostDto.getContent());
		blogPost.setDescription(blogPostDto.getDescription());
		blogPost.setTitle(blogPostDto.getTitle());
		blogPost.setBlogId(blogPostDto.getBlogId());
		return blogPost;
	}

	private BlogPostDto mapEntityToDto(BlogPost blogPost) {
		BlogPostDto blogDto = new BlogPostDto();
		blogDto.setBlogId(blogPost.getBlogId());
		blogDto.setContent(blogPost.getContent());
		blogDto.setDescription(blogPost.getDescription());
		blogDto.setTitle(blogPost.getTitle());
		return blogDto;
	}
	
	public BlogPostDto findByBlogPostId(Integer id) {
		Optional<BlogPost> findById = blogPostRepo.findById(id);
		 BlogPost orElseThrow = findById.orElseThrow(()->new ResourceNotFoundException("BlogPost", "Id", id));
	
		 return mapEntityToDto(orElseThrow);
	
	}


	@Override
	public List<BlogPostDto> findAll() {
		List<BlogPost> blogList = blogPostRepo.findAll();
		List<BlogPostDto> blogDtoList = new ArrayList<>();
		for(BlogPost b : blogList) {
			blogDtoList.add(mapEntityToDto(b));
		}
		return blogDtoList;
	}


	@Override
	public BlogPostDto updateBlogPost(BlogPostDto dto) {
		Optional<BlogPost> findById = blogPostRepo.findById(dto.getBlogId());
		
		BlogPost update = null;
		
		if(findById.isPresent()) { 
			update = blogPostRepo.save(mapDtoToEntity(dto));
		}else {
			throw new ResourceNotFoundException("BlogPost", "ID", dto.getBlogId());
		}
		return mapEntityToDto(update);
	}


	@Override
	public List<BlogPostDto> findAll(PageRequest page) {
		
		Page<BlogPost> blogsPage = blogPostRepo.findAll(page);
		
		return blogsPage.getContent().stream().map(post -> mapEntityToDto(post)).toList();
	}


	@Override
	public void deleteBlogPostById(Integer id) {
		Optional<BlogPost> blogPost = blogPostRepo.findById(id);
		if(blogPost.isPresent()) {
			blogPostRepo.deleteById(id);
		}else {
			throw new ResourceNotFoundException("BlogPost", "Id", id);
		}
		
	}
	
	
}
