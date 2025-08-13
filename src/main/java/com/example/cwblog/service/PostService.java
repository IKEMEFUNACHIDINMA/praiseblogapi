package com.example.cwblog.service;

import com.example.cwblog.model.Post;

public interface PostService {

    //CREATE CONTENT
    Post createPost(Post post);

    //GET CONTENT BY ID
    Post getPostById(String id);
}
