package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtag {

    @Id
    @GeneratedValue
    private long id;
    private String hashtagName;
    @ManyToMany(mappedBy = "hashtag")
    private Collection<Post> posts;


    protected Hashtag() {
    }

    public Hashtag(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    public long getId() {
        return id;
    }

    public String getHashtagName() {
        return hashtagName;
    }
//
//    public Collection<Post> getPost() {
//        return Post;
//    }
}
