package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.AuthorC;


public interface AuthorRepository extends CrudRepository<AuthorC,Long> {
//     AuthorC findPostByAuthor(String authorName);

}

