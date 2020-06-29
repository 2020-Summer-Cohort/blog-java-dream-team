package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.BlogName;
import org.wcci.blog.storage.repositories.ShowsRepository;


@Service
public class ShowStorage {

    private ShowsRepository showsRepo;

    public ShowStorage(ShowsRepository showsRepo) {
        this.showsRepo = showsRepo;
    }

    public BlogName findShowsByName(String title) {
        return showsRepo.findByPostTitle(title);
    }

    public Iterable<BlogName> findAllShows() {
        return showsRepo.findAll();
    }


}

