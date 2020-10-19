package com.allen.service.impl;

import com.allen.entity.StudentEO;
import com.allen.repository.ShardRepository;
import com.allen.service.ShardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ShardServiceImpl
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/3 0003
 * @Version V1.0
 **/
@Service
public class ShardServiceImpl implements ShardService {

    @Autowired
    private ShardRepository shardRepository;

    @Override
    public void insertData() {
        for(int i=0;i<100;i++){
            StudentEO studentEO=new StudentEO();
            studentEO.setStuId(Long.parseLong(String.valueOf(i)));
            studentEO.setName("张三"+i);
            studentEO.setClassName("班级"+i);
            shardRepository.save(studentEO);
        }
    }

    @Override
    public List<StudentEO> findAllData() {
        return shardRepository.findAll();
    }

    @Override
    public void insertSingle(String param) {
        StudentEO studentEO=new StudentEO();
        studentEO.setStuId(Long.parseLong(String.valueOf(param)));
        studentEO.setName("张三"+param);
        studentEO.setClassName("班级"+param);
        shardRepository.save(studentEO);
    }
}
