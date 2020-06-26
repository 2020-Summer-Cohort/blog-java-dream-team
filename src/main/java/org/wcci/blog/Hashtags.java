package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtags {

    @Id
    @GeneratedValue
    private long id;
    private String hashtagName;
//    @ManyToMany(mappedBy = "hashtags")
//    private Collection<Post> posts;


    protected Hashtags() {
    }

    public Hashtags(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    public long getId() {
        return id;
    }

    public String getHashtagName() {
        return hashtagName;
    }

//    public Collection<Post> getReviews() {
//        return Post;
//    }
}
