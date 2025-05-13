package com.fmc.service;

import java.util.List;

import com.fmc.dto.CommentDto;

public interface CommentService {

	CommentDto getCommentById();
	
	List<CommentDto> getAllComments();
	
	CommentDto addComment();
	
	CommentDto updateComment();
	
	CommentDto deleteComment();
}
