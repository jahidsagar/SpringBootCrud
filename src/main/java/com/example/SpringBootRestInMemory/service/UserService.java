package com.example.SpringBootRestInMemory.service;

import com.example.SpringBootRestInMemory.model.UserModel;
import com.example.SpringBootRestInMemory.repository.UserInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService implements UserInterface {
    private List<UserModel> userModels = new ArrayList<>();

    @Override
    public List<UserModel> getAll() {
        return userModels;
    }

    @Override
    public UserModel store(UserModel userModel) {
        if(userModel.getId() == null) userModel.setId(UUID.randomUUID().toString());
        userModels.add(userModel);
        return  userModel;
    }

    @Override
    public UserModel findById(String id) {
        return userModels
                .stream()
                .filter(userModel -> userModel.getId().equalsIgnoreCase(id))
                .findFirst()
                .get();
    }

    @Override
    public UserModel edit(String id, String name) {
        UserModel userModel = userModels
                .stream()
                .filter(userModel1 -> userModel1.getId().equalsIgnoreCase(id))
                .findFirst()
                .get();
        userModels.remove(userModel);
        userModel.setName(name);
        userModels.add(userModel);
        return  userModel;
    }

    @Override
    public UserModel delete(String id) {
        UserModel user = userModels
                .stream()
                .filter(userModel -> userModel.getId().equalsIgnoreCase(id))
                .findFirst()
                .get();
        userModels.remove(user);
        return user;
    }
}
