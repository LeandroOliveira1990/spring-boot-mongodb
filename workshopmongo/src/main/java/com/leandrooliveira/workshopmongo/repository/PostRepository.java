package com.leandrooliveira.workshopmongo.repository;

import com.leandrooliveira.workshopmongo.domain.Post;
import com.leandrooliveira.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {




}
