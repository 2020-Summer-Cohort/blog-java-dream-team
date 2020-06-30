package org.wcci.blog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.storage.AuthorStorage;


public class AuthorController {
    AuthorStorage authorStorage;

    public AuthorController(AuthorStorage authorStorage){
        this.authorStorage=authorStorage;
    }


    @RequestMapping("author")
    public String showAllAuthors(Model model){
        model.addAttribute("authors",authorStorage.findAllAuthorC());
        return "Author-template";
    }
//    @RequestMapping("authors/{authorName}")
//    public String showSingleAuthor(Model model){
//        model.addAttribute("authorName",authorStorage.findPostsByAuthor(String authorName));
//        return "individual-author-template";
//    }

}
