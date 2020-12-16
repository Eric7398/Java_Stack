package com.marvin.main.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.marvin.main.models.Contact;
import com.marvin.main.models.Student;
import com.marvin.main.services.ContactService;
import com.marvin.main.services.StudentService;

@Controller
public class MainController {
    @Autowired
    private StudentService studentService;
    
    @Autowired
    private ContactService contactService;

    // -------- RENDERS ALL STUDENTS PAGE -------------//

    @GetMapping("/students")
    public String allStudents(Model model){

        model.addAttribute("students", studentService.showAllStudents());
        return "students.jsp";
    }

    // -------- RENDERS CREATE STUDENT PAGE -------------//

    @GetMapping("/student/new")
    public String showStudentForm(@ModelAttribute("student") Student student) {
        return "newStudent.jsp";
    }

    // -------- PROCESSES CREATE STUDENT FORM -------------//

    @PostMapping("/student/new")
    public String processStudentForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "newStudent.jsp";

        } else {
            studentService.saveStudent(student);
            Long id = student.getId();
            return "redirect:/contact/new/" + id;
        }
    }
    
    // -------- RENDERS CREATE CONTACT PAGE -------------//
    // **ModelAttribute on render has no value, but is needed to render form:form** 

    @GetMapping("/contact/new/{id}")
    public String showContactForm(@PathVariable("id") Long id, @ModelAttribute("contact") Contact contact, Model model) {
        model.addAttribute("student", studentService.findStudentById(id));
        return "newContact.jsp";
    }
    
    // -------- PROCESSES CREATE CONTACT FORM -------------//

    @PostMapping("/contact/new")
    public String processContactForm(@Valid @ModelAttribute("contact") Contact contact, BindingResult result) {
        
        if (result.hasErrors()){
            return "newContact.jsp";
        
        } else {
            Long id = contact.getStudent().getId();
            Student s = studentService.findStudentById(id);
            if (s.getContact() != null) {
                //update
                contactService.saveContact(s.getContact().getId(), contact);
            } else {
                //create
                contactService.saveContact(contact);
            }
            return "redirect:/students";
        }
    }


    // -------- UPDATE STUDENTS CONTACT INFO -------------//




}






