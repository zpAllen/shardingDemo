package com.allen.controller;

import com.allen.entity.StudentEO;
import com.allen.service.ShardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ShardingController
 * @Description:
 * @Author Administrator
 * @Date 2020/6/3 0003
 * @Version V1.0
 **/
@RestController
@RequestMapping("/shard")
public class ShardingController {

    @Autowired
    private ShardService shardService;


    @RequestMapping(path = "/insertData",method = RequestMethod.GET)
    public String insertData(){
        shardService.insertData();
        return "success";
    }


    @RequestMapping(path = "/insertSingle",method = RequestMethod.GET)
    public String insertSingle(@RequestParam("param")String param){
        shardService.insertSingle(param);
        return "success";
    }



    @RequestMapping(path = "/findAllData",method = RequestMethod.GET)
    public String findAllData(){
        List<StudentEO> list=shardService.findAllData();
        return String.valueOf(list.size());
    }

}
