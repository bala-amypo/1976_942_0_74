package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;
import 

@Service
public class StudentServiceImplement implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Stuentity student){
        return studentRepository.save(student);
    }
}