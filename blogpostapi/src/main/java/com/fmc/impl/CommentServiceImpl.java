package com.fmc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fmc.dto.CommentDto;
import com.fmc.entity.Comment;
import com.fmc.repository.CommentRepository;
import com.fmc.service.CommentService;

public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository commentRepo;
	
	public Comment mapDtoToEntity(CommentDto commentDto) {
		Comment comment = new Comment();
		comment.setBody(commentDto.getBody());
		comment.setEmail(commentDto.getEmail());
		comment.setName(commentDto.getName());
		
		return comment;
	}
	
	public CommentDto mapEntityToDto(Comment comment) {
		CommentDto commentDto = new CommentDto();
		commentDto.setBody(comment.getBody());
		commentDto.setEmail(comment.getEmail());
		commentDto.setId(comment.getId());
		commentDto.setName(comment.getName());
		
		return commentDto;
	}
	@Override
	public CommentDto getCommentById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommentDto> getAllComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentDto addComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentDto updateComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentDto deleteComment() {
		// TODO Auto-generated method stub
		return null;
	}

}
