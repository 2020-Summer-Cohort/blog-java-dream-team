package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.BlogName;

public interface ShowsRepository extends CrudRepository<BlogName, Long> {
    BlogName findByPostTitle(String postTitle);
}
