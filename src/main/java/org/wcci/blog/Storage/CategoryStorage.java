package org.wcci.blog.Storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.Category;
import org.wcci.blog.Repo.CategoriesRepository;

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
