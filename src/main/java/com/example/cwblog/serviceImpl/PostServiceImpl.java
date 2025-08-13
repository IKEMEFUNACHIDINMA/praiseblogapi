package com.example.cwblog.serviceImpl;

import com.example.cwblog.model.Post;
import com.example.cwblog.repository.PostRepository;
import com.example.cwblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public Post createPost(Post post) {
        Post newPost = new Post();
        newPost.setId(post.getId());
        newPost.setTitle(post.getTitle());
        newPost.setBody(post.getBody());

        postRepository.save(newPost);
        return newPost;
    }

    @Override
    public Post getPostById(String id) {
        return postRepository.getById(id);
    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }
}
