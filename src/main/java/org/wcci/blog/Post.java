package org.wcci.blog;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String author;

    private String body;
    private String publishDate;
    private String genre;

    public Post(long id, String title, String author, String body, String publishDate, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.body = body;
        this.publishDate = publishDate;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
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
