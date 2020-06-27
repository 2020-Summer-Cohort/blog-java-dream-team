package org.wcci.blog.Storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.Hashtag;
import org.wcci.blog.Repo.HashtagsRepository;

@Service
public class HashtagStorage {

    HashtagsRepository hashtagsRepo;

    public HashtagStorage(HashtagsRepository hashtagsRepo) {
        this.hashtagsRepo = hashtagsRepo;
    }

    public Hashtag findHashtagsByPost(String hashtagName) {
        return hashtagsRepo.findHashtagsByPost(hashtagName);
    }

    public Iterable<Hashtag> findAllHashtags() {
        return hashtagsRepo.findAll();
    }

    public Hashtag findById(Long hashtagID) {
        return hashtagsRepo.findById(hashtagID).get();
    }

    public void saveHashtags(Hashtag hashtag) { hashtagsRepo.save(hashtag); }

    public void removeHashtags(Hashtag hashtag) { hashtagsRepo.delete(hashtag); }
}
