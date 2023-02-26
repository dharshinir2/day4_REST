package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Models.Student;
import com.example.Repositories.StudentRepo;

@Service
public class ApiService {
	@Autowired
	StudentRepo repository;
	public String updateDetails(Student stu) {
		repository.save(stu);
		return "Updated";
	}
	public String deteleDetails(int id)
	{
		repository.deleteById(id);
		return "Deleted";
	}

}
