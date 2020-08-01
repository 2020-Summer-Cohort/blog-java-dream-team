package org.wcci.blog.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private long id;
    private String authorName;
    @ManyToMany
    private Collection <BlogPosts> blogPosts;
    @ManyToOne
    private Categories categories;


    protected Author() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public Author(String authorName){
        this.authorName = authorName;

    }

}
