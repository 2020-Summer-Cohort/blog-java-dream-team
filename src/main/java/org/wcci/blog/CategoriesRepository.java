package org.wcci.blog;

import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Category, Long> {
    Category findByName(String name);
}
