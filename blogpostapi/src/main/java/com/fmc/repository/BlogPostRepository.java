package com.fmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.entity.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer>{

}
