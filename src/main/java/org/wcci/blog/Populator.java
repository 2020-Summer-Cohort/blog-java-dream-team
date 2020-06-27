package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.blog.Repo.CategoriesRepository;
import org.wcci.blog.Repo.HashtagsRepository;
import org.wcci.blog.Repo.PostRepository;
import org.wcci.blog.Storage.CategoryStorage;
import org.wcci.blog.Storage.HashtagStorage;
import org.wcci.blog.Storage.PostStorage;


@Component
public class Populator implements CommandLineRunner {
    @Autowired
    CategoriesRepository categoriesRepo;
    @Autowired
    PostRepository postRepo;
    @Autowired
    HashtagsRepository hashtagsRepo;
    //@Override

    public Populator() {
    }

    public void run(String... args) throws Exception {
        Category category1 = new Category("Fish");
        categoriesRepo.save(category1);
        Category category2 = new Category("Plants");
        categoriesRepo.save(category2);

//        Post post1 = new Post("foaewjfoi","author","stringbody","May 21, 1977","Rap");
//        postRepo.save(post1);
//
//        Hashtag hashtag1 = new Hashtag("#funny");
//        hashtagsRepo.save(hashtag1);
    }
}