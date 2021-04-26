package com.m.holmes2076.blog.repo;


import com.m.holmes2076.blog.models.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Long> {};