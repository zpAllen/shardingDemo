package com.allen.service;

import com.allen.entity.StudentEO;

import java.util.List;

/**
 * @ClassName ShardService
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/3 0003
 * @Version V1.0
 **/
public interface ShardService {

    void insertData();

    List<StudentEO> findAllData();

    void insertSingle(String param);
}
