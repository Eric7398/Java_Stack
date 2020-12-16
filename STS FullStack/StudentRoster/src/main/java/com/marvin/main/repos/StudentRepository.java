package com.marvin.main.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marvin.main.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
    List<Student> findAll();
}
