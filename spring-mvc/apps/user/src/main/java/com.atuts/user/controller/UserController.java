package com.atuts.user.controller;


import atuts.user.service.UserService;
import com.atuts.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping(value = "/name",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public User getUserName() {

       /* userService.getUser();*/
        User user1=new User();
        user1.setName(userService.getUser().getName());
        return user1;
    }
}
