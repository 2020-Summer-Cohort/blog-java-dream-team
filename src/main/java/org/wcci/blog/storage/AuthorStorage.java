package org.wcci.blog.storage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Service;
import org.wcci.blog.entities.AuthorC;
import org.wcci.blog.entities.Hashtags;
import org.wcci.blog.storage.repositories.AuthorRepository;

import javax.persistence.Id;

@Service
public class AuthorStorage {
    AuthorRepository authorRepo;

    public AuthorStorage(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

//    public Iterable<AuthorC> findAllAuthorC(){
//        return authorRepo.finda.get();
//    }
//
//    public AuthorC findPostsByAuthor(String authorName) {
//        return authorRepo.findPostByAuthor(authorName);
//    }
//public AuthorC findAuthorById(Long authorCID){
//        return authorRepo.findById2(authorCID);
//}

//    public Hashtags findById(Long hashtagID) {
//        return hashtagsRepo.findById(hashtagID).get();
//    }


    public void saveAuthorName(AuthorC authorC) {
        authorRepo.save(authorC);
    }

    public void removeAuthorName(AuthorC authorC) {
        authorRepo.delete(authorC);
    }
}