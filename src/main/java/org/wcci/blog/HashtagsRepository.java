package org.wcci.blog;


import org.springframework.data.repository.CrudRepository;

public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {

    Hashtag findHashtagsByPost(String hashtagName);

}