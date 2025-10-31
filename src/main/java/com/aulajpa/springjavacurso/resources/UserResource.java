package com.aulajpa.springjavacurso.resources;

import com.aulajpa.springjavacurso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAllUsers() {
        User user = new User(1L,"Andre","andre@gmail.com","99999999","4518123");
        return ResponseEntity.ok().body(user);
    }
}
