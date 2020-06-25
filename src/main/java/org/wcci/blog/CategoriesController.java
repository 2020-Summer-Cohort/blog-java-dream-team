package org.wcci.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoriesController {
    CategoryStorage categoryStorage;

    public CategoriesController(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    @RequestMapping({"categories"})
    public String showAllCategories(Model model) {
        model.addAttribute("categoryNames", this.categoryStorage.findAllCategories());
        return "categories-template";
    }

    @RequestMapping({"categories/{categoryName}"})
    public String showAdultAnimationShows(Model model, @PathVariable String categoryName) {
        model.addAttribute("category", this.categoryStorage.findCategoriesByName(categoryName));
        return "sub-category-template";
    }
}
