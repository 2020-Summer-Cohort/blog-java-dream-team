package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class CategoryStorage {
    private CategoriesRepository categoriesRepo;

    public CategoryStorage(CategoriesRepository categoriesRepo) {
        this.categoriesRepo = categoriesRepo;
    }

    public Categories findCategoriesByName(String name) {
        return this.categoriesRepo.findByName(name);
    }

    public Iterable<Categories> findAllCategories() {
        return this.categoriesRepo.findAll();
    }
}
