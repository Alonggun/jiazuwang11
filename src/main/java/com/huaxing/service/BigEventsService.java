package com.huaxing.service;

import com.huaxing.entity.TbBigEvents;

import java.util.List;

public interface BigEventsService {
    List<TbBigEvents> findBigEventsList();

    void insertBigEvents(TbBigEvents bigEvents);
}
