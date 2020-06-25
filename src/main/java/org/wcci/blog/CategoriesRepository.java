package org.wcci.blog;

import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Categories, Long> {
    Categories findByName(String name);
}
