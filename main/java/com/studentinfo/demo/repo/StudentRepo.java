package com.studentinfo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentinfo.demo.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
