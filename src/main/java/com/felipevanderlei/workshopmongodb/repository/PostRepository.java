package com.felipevanderlei.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.felipevanderlei.workshopmongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
