package org.wcci.blog.Storage;
import org.springframework.stereotype.Service;
import org.wcci.blog.Post;
import org.wcci.blog.Repo.PostRepository;

@Service
public class PostStorage {

    private PostRepository postRepo;

    public PostStorage(PostRepository postRepo){ this.postRepo =postRepo;}

    public Post findPostsByTitle(String title){ return postRepo.findPostsByTitle(title);}
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