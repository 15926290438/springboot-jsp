package com.springbootjsp.repository;


import com.springbootjsp.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(int id);
    public void saveAndUpdate(Student student);
    public void delete(int id);
}
