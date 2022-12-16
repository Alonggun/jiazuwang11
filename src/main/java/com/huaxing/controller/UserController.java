package com.huaxing.controller;

import com.huaxing.entity.TbUser;
import com.huaxing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/findUserList")
    public List<TbUser> findUserList(TbUser user){
        return userService.findUserList(user);
    }
}
