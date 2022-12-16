package com.huaxing.controller;

import com.huaxing.Util.Result;
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

    @RequestMapping("/insertUser")
    public Result insertUser(TbUser user){
        try {
            userService.insertUser(user);
            return new Result(true,"添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败！");
        }

    }
}
