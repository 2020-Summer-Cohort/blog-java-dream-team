package org.wcci.blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.Storage.HashtagStorage;
import org.wcci.blog.Storage.PostStorage;

@Controller

public class PostController {
    private PostStorage postStorage;
    private HashtagStorage hashtagstorage;

public PostController(PostStorage postStorage, HashtagStorage hashtagStorage){
    this.postStorage = postStorage;
    this.hashtagstorage = hashtagStorage;
}


    @RequestMapping("post/{title}")
    public String showSinglePost(@PathVariable String title, Model model){
        model.addAttribute("post", postStorage.findPostsByTitle(title));
        return "post-template";

}
    @RequestMapping("hashtags/{hashtagID}")
    public String showReviewsAssociatedWithHashtag(@PathVariable Long hashtagID, Model model) {
        model.addAttribute("hashtag", hashtagstorage.findById(hashtagID));
        return "hashtags-template"; //need to make a new template and insert instead
    }
}
