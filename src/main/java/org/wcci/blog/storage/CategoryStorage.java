package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.Categories;
import org.wcci.blog.storage.repositories.CategoriesRepository;


@Service
public class CategoryStorage {

    private CategoriesRepository categoriesRepo;

    public CategoryStorage(CategoriesRepository categoriesRepo) {
        this.categoriesRepo = categoriesRepo;
    }

    public Categories findCategoriesByName(String name) {
        return categoriesRepo.findByName(name);
    }

    public Iterable<Categories> findAllCategories() {
        return categoriesRepo.findAll();
    }
}



