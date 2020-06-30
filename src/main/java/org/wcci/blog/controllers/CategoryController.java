package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.entities.AuthorC;
import org.wcci.blog.entities.Categories;
import org.wcci.blog.entities.Hashtags;
import org.wcci.blog.storage.CategoryStorage;
import org.wcci.blog.storage.AuthorStorage;
import org.wcci.blog.storage.HashtagsStorage;
import org.wcci.blog.storage.BlogPostStorage;

import java.util.ArrayList;
import java.util.Collection;


@Controller
public class CategoryController {


    CategoryStorage categoryStorage;

    public CategoryController(CategoryStorage categoryStorage) {

        this.categoryStorage = categoryStorage;
    }

    @RequestMapping("categories")
    public String showAllCategories(Model model) {
        model.addAttribute("categoryNames", categoryStorage.findAllCategories());
        return "categories-template";
    }

    @RequestMapping("categories/{categoryName}")
    public String showAdultAnimationShows(Model model, @PathVariable String categoryName) {
        model.addAttribute("category", categoryStorage.findCategoriesByName(categoryName));
        return "sub-category-template";// category template th: text h1 element
    }

    @PostMapping("post/add")
    public String addNewPost(String title, String body, String authors, String tags, String categoryName) {
        Categories postCategory = categoryStorage.findCategoriesByName(categoryName);
        Collection<Hashtags> postTags = new ArrayList<Hashtags>();
        postTags.add (HashtagsStorage.findById(hashtagId));
        Collection<AuthorC> postAuthors = new ArrayList<AuthorC>();
        postAuthors.add(AuthorStorage.findbyName(postAuthors));
        PostC postToAdd = new PostC (title, body, postAuthors, postTags, postCategory);
      BlogPostStorage.save(postToAdd);
        return "redirect:/categories/" + postCategory.getName();
    }
}