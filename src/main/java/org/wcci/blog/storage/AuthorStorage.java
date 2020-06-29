package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.AuthorC;
import org.wcci.blog.storage.repositories.AuthorRepository;

@Service
public class AuthorStorage {
    AuthorRepository authorRepo;

    public AuthorStorage(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    public Iterable<AuthorC> findAllAuthorC(){
        return authorRepo.findAll();
    }

    public AuthorC findPostsByAuthor(String authorName) {
        return authorRepo.findPostByAuthor(authorName);
    }

    public void saveAuthorName(AuthorC authorC) {
        authorRepo.save(authorC);
    }

    public void removeAuthorName(AuthorC authorC) {
        authorRepo.delete(authorC);
    }
}