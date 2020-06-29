package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.AuthorC;


public interface AuthorRepository extends CrudRepository<AuthorC,Long> {
    default AuthorC findPostByAuthor(String authorName) {
        return null;
    }

}
//public interface CategoriesRepository extends CrudRepository<Categories, Long> {
//    Categories findByName(String name);
//}
