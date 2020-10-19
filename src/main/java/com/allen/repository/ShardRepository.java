package com.allen.repository;

import com.allen.entity.StudentEO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName ShardRepository
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/3 0003
 * @Version V1.0
 **/
public interface ShardRepository extends JpaRepository<StudentEO,Long> {


}
