package org.wcci.blog.Repo;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
    Post findPostsByTitle(String title);
}

