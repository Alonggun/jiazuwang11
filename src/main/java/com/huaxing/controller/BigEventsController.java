package com.huaxing.controller;

import com.huaxing.Util.Result;
import com.huaxing.entity.TbBigEvents;
import com.huaxing.service.BigEventsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bigEvents")
public class BigEventsController {
    @Resource
    private BigEventsService bigEventsService;

    @RequestMapping("/findBigEventsList")
    public List<TbBigEvents> findBigEventsList(){
        return bigEventsService.findBigEventsList();
    }

    @RequestMapping("/insertBigEvents")
    public Result insertBigEvents(@RequestBody TbBigEvents bigEvents){
        try {
            bigEventsService.insertBigEvents(bigEvents);
            return new Result(true,"发表成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"发表失败");
        }
    }
}
