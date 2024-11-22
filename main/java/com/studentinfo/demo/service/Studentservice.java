package com.studentinfo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.studentinfo.demo.dao.Studentdao;
import com.studentinfo.demo.entity.StudentEntity;

@Service
public class Studentservice {

	@Autowired
	Studentdao studentDao;
	
	public String addInfo(StudentEntity studentEntity) {
		return studentDao.addInfo(studentEntity);
	}
	
	public List<StudentEntity>getAll(){
		return studentDao.getAll();
	}
	 public String deleteId(int id) {
		 return studentDao.deleteId(id);
	 }

	public List<StudentEntity> getAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public StudentEntity getInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
