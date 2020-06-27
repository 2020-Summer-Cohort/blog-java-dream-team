package org.wcci.blog;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class PostController {
    private PostStorage postStorage;
    private HashtagStorage hashtagstorage;

public PostController(PostStorage postStorage, HashtagStorage hashtagStorage){
    this.postStorage = postStorage;
    this.hashtagstorage = hashtagStorage;
}

    public PostController(PostStorage postStorage) {
        this.postStorage = postStorage;
    }
    @RequestMapping("posts/{postTitle}")
    public String showSinglePost(@PathVariable String postTitle, Model model){
        model.addAttribute("posts", postStorage.findPostsByTitle(postTitle));
        return "post-template";

}
}
