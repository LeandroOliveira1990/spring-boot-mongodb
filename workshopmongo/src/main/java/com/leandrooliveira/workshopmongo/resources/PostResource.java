package com.leandrooliveira.workshopmongo.resources;

import com.leandrooliveira.workshopmongo.domain.Post;
import com.leandrooliveira.workshopmongo.domain.User;
import com.leandrooliveira.workshopmongo.dto.UserDTO;
import com.leandrooliveira.workshopmongo.resources.util.URL;
import com.leandrooliveira.workshopmongo.services.PostService;
import com.leandrooliveira.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;





    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text){
        text = URL.decodeParam(text);
        List<Post> list = postService.findByTitle(text);


        return ResponseEntity.ok().body(list);
    }





}
