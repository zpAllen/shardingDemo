package com.allen.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Student
 * @Description:
 * @Author Administrator
 * @Date 2020/6/3 0003
 * @Version V1.0
 **/
@Data
@Table(name = "student")
@Entity
public class StudentEO {

    @Id
    @Column(name = "stu_id")
    private Long stuId;

    @Column(name = "name")
    private String name;

    @Column(name = "class_name")
    private String className;
}
