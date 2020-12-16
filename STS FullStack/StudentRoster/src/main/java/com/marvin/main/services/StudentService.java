package com.marvin.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marvin.main.models.Student;
import com.marvin.main.repos.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    // ------------- SHOW ALL STUDENTS ------------- // 

    public List<Student> showAllStudents() {
        
        return studentRepo.findAll();
    } 

    // -------------- FIND STUDENT BY ID  -------------- //

    public Student findStudentById(Long id) {
        Optional<Student> student = studentRepo.findById(id);
        if(student.isPresent()){
            return student.get();
        } else {
            return null;
        }
    }
    
    //---------------CREATE/UPDATE STUDENT--------------------//
    
    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
    
    // -------------- DELETE STUDENT -------------- //
    
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }





}
