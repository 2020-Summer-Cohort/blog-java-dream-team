package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.Author;
import org.wcci.blog.entities.Hashtags;
import org.wcci.blog.storage.repositories.AuthorRepository;
import org.wcci.blog.storage.repositories.HashtagsRepository;

@Service
public class AuthorStorage {
    AuthorRepository authorRepo;
    HashtagsRepository hashtagsRepo;

    public AuthorStorage(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }


    public Author findPostsByAuthor(String authorName) {
        return authorRepo.findPostByAuthor(authorName);
    }

    public Hashtags findById(Long hashtagID) {
        return hashtagsRepo.findById(hashtagID).get();
    }


    public void saveAuthorName(Author authorC) {
        authorRepo.save(authorC);
    }

    public void removeAuthorName(Author authorC) {
        authorRepo.delete(authorC);
    }
}