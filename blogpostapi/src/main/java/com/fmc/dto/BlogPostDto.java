package com.fmc.dto;

import lombok.Data;

@Data
public class BlogPostDto {

	private Integer blogId;
	private String content;
	private String description;
	private String title;
}
