package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService{
    @Autowired
    StudentRepository studentRepository
}