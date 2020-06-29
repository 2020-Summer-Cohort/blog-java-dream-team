package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.Hashtags;

public interface HashtagsRepository extends CrudRepository<Hashtags, Long> {

   // Hashtags findHashtagsByReviews(String hashtagName);

}
