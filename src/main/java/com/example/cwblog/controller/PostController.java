package com.example.cwblog.controller;

import com.example.cwblog.model.Post;
import com.example.cwblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/content")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @GetMapping("/{id}")
    public String getPostById(@PathVariable String id) {
        return postService.getPostById(id).toString();
    }

    @GetMapping
    public List<Post> getAllPost() {
        return postService.getAllPost();
    }
}
