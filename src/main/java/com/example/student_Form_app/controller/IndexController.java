package com.example.student_Form_app.controller;

import com.example.student_Form_app.model.User;
import com.example.student_Form_app.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @Autowired
    UserServiceImpl userServiceInterface;
    @GetMapping("/")
    public String index(){
        return "index";
    }

   @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model){
        System.out.println(user.toString());
        userServiceInterface.userRegistration(user);

        model.addAttribute("firstname" , user.getFname());
        model.addAttribute("lastname", user.getLname());
        return "success";
    }
}
