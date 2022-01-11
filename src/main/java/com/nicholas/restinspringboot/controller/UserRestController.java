package com.nicholas.restinspringboot.controller;

import com.nicholas.restinspringboot.respositories.UsersRepository;
import com.nicholas.restinspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class UserRestController {
    //inject user repository
    @Autowired
    private UsersRepository userRepo;
    //below lets create a simple rest api
    @GetMapping("users")
    public List<User> getUserDetails(){
        return this.userRepo.findAll();
    }
}
