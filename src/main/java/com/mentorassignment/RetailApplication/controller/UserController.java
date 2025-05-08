package com.mentorassignment.RetailApplication.controller;

import com.mentorassignment.RetailApplication.model.User;
import com.mentorassignment.RetailApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String mail,@RequestParam String password){
        return ResponseEntity.ok(userService.userLogin(mail,password));
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user)
    {
        return ResponseEntity.ok(userService.userRegister(user));
    }


}
