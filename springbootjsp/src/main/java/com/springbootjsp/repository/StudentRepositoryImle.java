package com.springbootjsp.repository;

import com.springbootjsp.entity.Student;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImle implements  StudentRepository{

    //HashMap的ke不能是基本数据类型
    private static Map<Integer, Student> stuMap;
    static {
        stuMap = new HashMap<Integer,Student>();
        stuMap.put(1,new Student(1,"张三",13));
        stuMap.put(2,new Student(2,"李四",34));
       }

    @Override
    public Collection<Student> findAll() {
        return stuMap.values();
    }

    @Override
    public Student findById(int id) {
        return stuMap.get(id);
    }

    @Override
    public void saveAndUpdate(Student student) {
        stuMap.put(student.getId(),student);
    }

    @Override
    public void delete(int id) {
        stuMap.remove(id);
    }

}
