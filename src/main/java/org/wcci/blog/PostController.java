package org.wcci.blog;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class PostController {
    private PostStorage postStorage;
//    private HashtagStorage hashtagstorage;

public PostController(){

}
//    private ReviewStorage reviewStorage;
//    private HashtagsStorage hashtagsStorage;
//
//
//    public ReviewsController(ReviewStorage reviewStorage, HashtagsStorage hashtagsStorage) {
//        this.reviewStorage = reviewStorage;
//        this.hashtagsStorage = hashtagsStorage;
//    }

    public PostController(PostStorage postStorage) {
        this.postStorage = postStorage;
    }
    @RequestMapping("posts/{postTitle}")
    public String showSinglePost(@PathVariable String postTitle, Model model){
        model.addAttribute("posts", postStorage.findPostsByTitle(postTitle));
        return "post-template";

//
//            @RequestMapping("reviews/{showTitle}")
//            public String showSingleReview(@PathVariable String showTitle, Model model) {
//            model.addAttribute("reviews", reviewStorage.findReviewsByShowTitle(showTitle));
////                model.addAttribute("adultcategories", categoryStorage.findCategoriesByName(categoryName).getShows());
//        return "review-template";
}
}
