package com.LibraryManagemenSystem.ManagementSystem.controller;

import com.LibraryManagemenSystem.ManagementSystem.dto.StudentRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Book;
import com.LibraryManagemenSystem.ManagementSystem.model.Student;
import com.LibraryManagemenSystem.ManagementSystem.service.StudentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/student")
public class StudentController {

    Logger logger = (Logger) LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){
        return studentService.addStudent(studentRequestDto);
    }
    @GetMapping("/findAll")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }

    


}