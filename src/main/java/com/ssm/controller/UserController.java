package com.ssm.controller;

import com.ssm.po.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wiseacre on 2018/7/26.
 */
@Controller

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public @ResponseBody User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
