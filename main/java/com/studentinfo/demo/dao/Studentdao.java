package com.studentinfo.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentinfo.demo.entity.StudentEntity;
import com.studentinfo.demo.repo.StudentRepo;

@Repository
public class Studentdao {
	@Autowired
	StudentRepo studentRepository;
	
	public String addInfo(StudentEntity studententity) {
		studentRepository.save(studententity);
		return"Data added to the DB";
	}

	public List<StudentEntity>getAll(){
		return studentRepository.findAll();
	}
	public String deleteId(int id) {
		studentRepository.deleteById(id);
		return"Data deleted from the DB";
	}
}
