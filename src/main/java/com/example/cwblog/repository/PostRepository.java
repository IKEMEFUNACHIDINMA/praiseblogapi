package com.example.cwblog.repository;

import com.example.cwblog.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PostRepository extends MongoRepository<Post,String> {

    Optional<Post> findByIdIgnoreCase(String id);

    Post getById(String id);
}
