package com.example.PracticeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PracticeProject.entity.Stuentity;

@Repository
public interface Sturepository extends JpaRepository<Stuentity, Long> {
    
    
}