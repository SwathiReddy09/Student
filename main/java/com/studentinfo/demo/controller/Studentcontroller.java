package com.studentinfo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentinfo.demo.entity.StudentEntity;
import com.studentinfo.demo.service.Studentservice;

@RestController
public class Studentcontroller {
	@Autowired
	Studentservice studentService ;
	@PostMapping(value="/add")
	public String addInfo(@RequestBody StudentEntity studentEntity) {
	return studentService.addInfo(studentEntity);
}
	@GetMapping(value="/display")
	public List<StudentEntity> getAllDetails(){
		return studentService.getAllDetails();
		
	}
	@GetMapping(value="/display/{id}")
	public StudentEntity getInfo(@PathVariable int id) {
		return studentService.getInfo(id);
	}
}

