package com.example.student_Form_app.service.impl;

import com.example.student_Form_app.model.User;
import com.example.student_Form_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  {

    @Autowired
    UserRepository userRepository;
    public void userRegistration(User user){
        userRepository.save(user);
    }
}
