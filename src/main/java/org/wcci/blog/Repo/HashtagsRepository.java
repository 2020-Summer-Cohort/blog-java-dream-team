package org.wcci.blog.Repo;


import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.Hashtag;

public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {

    Hashtag findHashtagsByPost(String hashtagName);

}