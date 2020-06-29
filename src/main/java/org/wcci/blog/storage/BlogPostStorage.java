package org.wcci.blog.storage;
//

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.BlogPosts;
import org.wcci.blog.storage.repositories.BlogPostsRepository;


@Service
public class BlogPostStorage {

    BlogPostsRepository reviewRepo;

    public BlogPostStorage(BlogPostsRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    public BlogPosts findReviewsByPostTitle(String postTitle) {
        return reviewRepo.findByPostTitle(postTitle);
    }

    public Iterable<BlogPosts> findAllReviews() {
        return reviewRepo.findAll();
    }

    public void save(BlogPosts blogPosts) {
        reviewRepo.save(blogPosts);
    }


}


