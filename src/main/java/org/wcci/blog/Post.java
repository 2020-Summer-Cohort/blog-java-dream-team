package org.wcci.blog;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private long id;
    private String postTitle;
    private String author;
    private String body;
    private String publishDate;
    private String genre;
    @ManyToMany
    private Collection <Hashtag> hashtags;

    protected Post(){

    }

    public Post ( String title, String author, String body, String publishDate, String genre) {
        this.postTitle = title;
        this.author = author;
        this.body = body;
        this.publishDate = publishDate;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getGenre() {
        return genre;
    }


}
