package com.ymm.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by slade on 2019/9/28.
 */
@Component(value = "myStudent")
public class Student {
    /*
    * @Value:简单类型的属性赋值
    *   属性：value是String类型的，表示简单类型的属性值
    *   位置：
    *       1、在属性定义的上面，无需set方法，常用的方法
    *       2、在set方法上面
    * */
    @Value("jack")
    private String name;
    @Value("20")
    private int age;
    /*
    * 引用类型：
    *   @Autowired:引用类型的自动注入，支持byName，byType，默认是byType
    *       位置：
    *           1、属性定义的上面，无需set方法，常用方式
    *           2、在set方法上面
    *
    * */
    @Autowired
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
