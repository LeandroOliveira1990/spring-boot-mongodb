package com.leandrooliveira.workshopmongo.services;

import com.leandrooliveira.workshopmongo.domain.Post;
import com.leandrooliveira.workshopmongo.repository.PostRepository;
import com.leandrooliveira.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return postRepository.searchTitle(text);
    }
}
