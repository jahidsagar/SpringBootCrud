package com.example.SpringBootRestInMemory.controller;

import com.example.SpringBootRestInMemory.model.UserModel;
import com.example.SpringBootRestInMemory.repository.UserInterface;
import com.example.SpringBootRestInMemory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInterface userInterface;

    @GetMapping
    public List<UserModel> getAllUsers(){
        return this.userInterface.getAll();
    }

    @PostMapping
    public UserModel storeUser(@RequestBody UserModel userModel){
        return this.userInterface.store(userModel);
    }

    @GetMapping("/{id}")
    public UserModel getById(@PathVariable String id){
        return this.userInterface.findById(id);
    }

    @GetMapping("/{id}/{name}")
    public UserModel getById(@PathVariable String id, @PathVariable String name){
        return this.userInterface.edit(id,name);
    }

    @DeleteMapping("/{id}")
    public UserModel deleteUser(@PathVariable String id){
        return this.userInterface.delete(id);
    }
}
