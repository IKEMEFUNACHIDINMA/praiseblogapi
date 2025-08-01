package com.example.cwblog.service;

import com.example.cwblog.dto.Logindto;
import com.example.cwblog.model.User;

public interface UserService {

    //REGISTER/CREATE
    User registerUser(User User);

    //LOGIN
    String loginUser(Logindto user);
}
