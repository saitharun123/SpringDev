package com.fmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
