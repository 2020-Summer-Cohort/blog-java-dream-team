package org.wcci.blog;
import org.springframework.stereotype.Service;

@Service
public class PostStorage {
    private PostRepository postRepo;
    public PostStorage(PostRepository postRepo){ this.postRepo =postRepo;}
    public Post findPostsbyTitle(String title){ return postRepo.findPostbyTitle(title); }
}


//
//
//
//
//public class CategoryStorage {
//
//    private CategoriesRepository categoriesRepo;
//
//    public CategoryStorage(CategoriesRepository categoriesRepo) {
//        this.categoriesRepo = categoriesRepo;
//    }
//
//    public Categories findCategoriesByName(String name) {
//        return categoriesRepo.findByName(name);
//    }
//
//    public Iterable<Categories> findAllCategories() {
//        return categoriesRepo.findAll();
//    }
//}