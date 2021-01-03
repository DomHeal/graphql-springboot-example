package com.dominicheal.graphql.service;

import com.dominicheal.graphql.domain.Post;
import com.dominicheal.graphql.repository.PostRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostService implements GraphQLMutationResolver, GraphQLQueryResolver {
    @Autowired
    private PostRepository postRepository;

    public Post writePost(String title, String text, String category) {
        return postRepository.savePost(title, text, category);
    }

    public Post deletePost(int id) {
        return postRepository.deletePost(id);
    }

    public List<Post> getPosts(int count, int offset) {
        return postRepository.getRecentPosts(count, offset);
    }
}
