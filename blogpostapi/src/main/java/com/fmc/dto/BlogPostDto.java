package com.fmc.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BlogPostDto {

	private Integer blogId;
	@NotEmpty
	@Size( min = 10, message = "Content should contain atleast 10 characters")
	private String content;
	@NotNull
	private String description;
	@NotEmpty
	@Size(min = 2, message = "Title should contain atleast 2 characters")
	private String title;
}
