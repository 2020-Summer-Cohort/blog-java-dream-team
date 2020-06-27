package org.wcci.blog.Repo;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.Category;

public interface CategoriesRepository extends CrudRepository<Category, Long> {
    Category findByName(String name);
}
