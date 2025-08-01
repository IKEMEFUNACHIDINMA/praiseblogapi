package com.example.cwblog.serviceImpl;

import com.example.cwblog.dto.Logindto;
import com.example.cwblog.exceptions.HandleEventDoesNotExistException;
import com.example.cwblog.model.User;
import com.example.cwblog.repository.UserRepository;
import com.example.cwblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User User) {
        User newUser = new User();
        newUser.setUserid(User.getUserid());
        newUser.setUsername(User.getUsername());
        newUser.setPassword(User.getPassword());
        newUser.setEmail(User.getEmail());
        newUser.setPhonenumber(User.getPhonenumber());

        userRepository.save(newUser);
        return newUser;
    }

    @Override
    public String loginUser(Logindto user) {
        User existing = userRepository.findByEmailIgnoreCase(String.valueOf(user.getEmail()))
               .orElseThrow(() -> new HandleEventDoesNotExistException("User details not found"));

       if (!existing.getPassword().equals(user.getPassword())){
           throw new HandleEventDoesNotExistException("Invalid Password");
       }
       return "User logged in";
    }
}
