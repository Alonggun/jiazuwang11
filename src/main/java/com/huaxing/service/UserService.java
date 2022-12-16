package com.huaxing.service;

import com.huaxing.entity.TbUser;

import java.util.List;

public interface UserService {
    List<TbUser> findUserList(TbUser user);
}
