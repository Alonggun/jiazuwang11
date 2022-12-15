package com.huaxing.mapper;

import com.huaxing.entity.TbBigEvents;

import java.util.List;

public interface BigEventsMapper {
    /*用户列表展示*/
    List<TbBigEvents> findBigEventsList();

    //插入家族事件
    void insertBigEvents(TbBigEvents bigEvents);
}
