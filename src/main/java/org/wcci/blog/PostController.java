package org.wcci.blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class PostController {
    private PostStorage postStorage;

    public PostController(PostStorage postStorage) {
        this.postStorage = postStorage;
    }
    @RequestMapping("posts/{postTitle}")
    public String showSinglePost(@PathVariable String postTitle, Model model){
        model.addAttribute()

//
//            @RequestMapping("reviews/{showTitle}")
//            public String showSingleReview(@PathVariable String showTitle, Model model) {
//            model.addAttribute("reviews", reviewStorage.findReviewsByShowTitle(showTitle));
////                model.addAttribute("adultcategories", categoryStorage.findCategoriesByName(categoryName).getShows());
//        return "review-template";
}
}
