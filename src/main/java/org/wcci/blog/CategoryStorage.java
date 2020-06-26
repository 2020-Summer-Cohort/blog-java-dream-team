package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class CategoryStorage {
    private CategoriesRepository categoriesRepo;

    public CategoryStorage(CategoriesRepository categoriesRepo) {
        this.categoriesRepo = categoriesRepo;
    }

    public Category findCategoriesByName(String name) {
        return this.categoriesRepo.findByName(name);
    }

    public Iterable<Category> findAllCategories() {
        return this.categoriesRepo.findAll();
    }
}
