package com.dominicheal.graphql.repository;

import com.dominicheal.graphql.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepository {

    public List<Post> getRecentPosts(int count, int offset){
        List<Post> posts = new ArrayList<>();
        return Optional.of(posts).get();
    }

    public Post savePost(String title, String text, String category) {
        Post post = new Post();
        post.setTitle(title);
        post.setCategory(category);
        post.setText(text);
        return post;
    }

    public Post deletePost(int id) {
        Post post = new Post();
        post.setId("1");
        return post;
    }
}
