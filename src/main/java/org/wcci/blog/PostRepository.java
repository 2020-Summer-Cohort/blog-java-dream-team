package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class PostRepository {
    private PostRepository postRepo;

    public PostRepository(PostRepository postRepo){
        this.postRepo =postRepo;
    }
    public Post findPostbyAuthor(String author){
        return postRepo.findPostbyAuthor(author);

    }
    public Post findPostbyTitle(String title){ return postRepo.findPostbyTitle (title);}
}
