package org.wcci.blog;
import org.springframework.stereotype.Service;

@Service
public class PostStorage {
    private PostRepository postRepo;
    public PostStorage(PostRepository postRepo){ this.postRepo =postRepo;}
    public Post findPostsByTitle(String title){ return postRepo.findByPostByTitle(title);}
        public void save (Post post) { postRepo.save(post);}
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