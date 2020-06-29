package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.BlogPosts;


public interface BlogPostsRepository extends CrudRepository<BlogPosts, Long> {
            BlogPosts findByPostTitle(String postTitle);
        }


