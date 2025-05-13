package com.fmc.controller;

import com.fmc.service.CommentService;

public class CommentController {

	private CommentService commentService;

	public CommentController(CommentService commentService) {
		super();
		this.commentService = commentService;
	}
	
	
}
