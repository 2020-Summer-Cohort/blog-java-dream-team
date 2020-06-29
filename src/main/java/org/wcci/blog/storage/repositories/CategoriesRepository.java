package org.wcci.blog.storage.repositories;


import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.Categories;

public interface CategoriesRepository extends CrudRepository <Categories, Long> {
    Categories findByName(String name);
}

