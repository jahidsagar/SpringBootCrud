package com.example.SpringBootRestInMemory.repository;

import com.example.SpringBootRestInMemory.model.UserModel;
import org.apache.catalina.User;

import java.util.List;

public interface UserInterface {
    public List<UserModel> getAll();

    public UserModel store(UserModel userModel);

    public UserModel findById(String id);

    public UserModel delete(String id);
}
