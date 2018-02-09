package com.atuts.user.controller;


import com.atuts.user.dto.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/user")
@EnableWebMvc
public class UserController {
    @ResponseBody
    @RequestMapping(value = "/name",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public User getUserName() {
        User user= new User();
        user.setName("parane");
        return user;
    }
}
