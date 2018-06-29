package com.felipevanderlei.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipevanderlei.workshopmongodb.domain.Post;
import com.felipevanderlei.workshopmongodb.repository.PostRepository;
import com.felipevanderlei.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
	}
	
	public List<Post> findByTitle(String text){
		return repository.findByTitle(text);
	}
}
