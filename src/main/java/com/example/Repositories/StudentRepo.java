package com.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Models.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
