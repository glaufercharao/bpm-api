package com.senior.bpmapi.resource;

import com.senior.bpmapi.entity.User;
import com.senior.bpmapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    @CrossOrigin
    public ResponseEntity<?> save(@RequestBody User user){
        boolean permission = userService.findOne(user);
        return ResponseEntity.ok().body(permission);
    }
}
