package com.example.springbootmysql.resource;


import com.example.springbootmysql.model.Users;
import com.example.springbootmysql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users ){
        usersRepository.save(users);
        return usersRepository.findAll();
    }
}
