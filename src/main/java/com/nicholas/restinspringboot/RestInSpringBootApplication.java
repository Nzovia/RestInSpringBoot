package com.nicholas.restinspringboot;

import com.nicholas.restinspringboot.respositories.UsersRepository;
import com.nicholas.restinspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestInSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestInSpringBootApplication.class, args);
    }
    @Autowired
    private UsersRepository usersRepository;
    @Override
    public void run(String... args) throws Exception {
        this.usersRepository.save(new User("Nicholas", "Maundu","nichon@gmail.com"));
        this.usersRepository.save(new User("Nicholas","Maundu","nzovia@gmail.com"));

    }
}
