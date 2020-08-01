package org.wcci.blog.storage;
//

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.BlogPosts;
import org.wcci.blog.entities.Hashtags;
import org.wcci.blog.storage.repositories.BlogPostsRepository;


@Service
public class BlogPostStorage {

    BlogPostsRepository blogpostRepo;
    BlogPosts blogPosts;

    public BlogPostStorage(BlogPostsRepository blogpostRepo) {
        this.blogpostRepo = blogpostRepo;
    }


    public BlogPosts findReviewsByPostTitle(String postTitle) {
        return blogpostRepo.findByPostTitle(postTitle);
    }

    public Iterable<BlogPosts> findAllReviews() {
        return blogpostRepo.findAll();
    }

    public void save(BlogPosts blogPosts) {
        blogpostRepo.save(blogPosts);
    }


}


