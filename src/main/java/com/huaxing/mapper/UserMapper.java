package com.huaxing.mapper;

import com.huaxing.entity.TbUser;

import java.util.List;

public interface UserMapper {
    List<TbUser> findUserList(TbUser user);

    void insertUser(TbUser user);
}
