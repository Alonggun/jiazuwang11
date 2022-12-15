package com.huaxing.service.Impl;

import com.huaxing.entity.TbBigEvents;
import com.huaxing.mapper.BigEventsMapper;
import com.huaxing.service.BigEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BigEventsServiceImpl implements BigEventsService {
    @Autowired
    private BigEventsMapper bigEventsMapper;

    @Override
    public List<TbBigEvents> findBigEventsList() {
        return bigEventsMapper.findBigEventsList();
    }

    @Override
    public void insertBigEvents(TbBigEvents bigEvents) {
         bigEventsMapper.insertBigEvents(bigEvents);
    }
}
