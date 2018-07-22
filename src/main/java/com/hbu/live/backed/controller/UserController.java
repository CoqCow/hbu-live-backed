package com.hbu.live.backed.controller;

import com.hbu.live.backed.model.User;
import com.hbu.live.backed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping( method = RequestMethod.GET)
    public ResponseEntity testUser(@RequestParam("userId") int userId){

        return  ResponseEntity.ok().body(userService.getUser(userId));
    }
}
