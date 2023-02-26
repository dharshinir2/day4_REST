package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Models.Student;
import com.example.Repositories.StudentRepo;
import com.example.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	StudentRepo serviceRepository;
	@Autowired
	ApiService service;
@PutMapping("/{id}")
public String update(@RequestBody Student stu)
{
	return service.updateDetails(stu);
}
@DeleteMapping("/{id}")
public String delete(@RequestParam int id)
{
	return service.deteleDetails(id);
}

}
