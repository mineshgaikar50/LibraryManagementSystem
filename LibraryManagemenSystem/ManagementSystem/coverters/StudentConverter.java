package com.LibraryManagemenSystem.ManagementSystem.coverters;


import com.LibraryManagemenSystem.ManagementSystem.dto.StudentRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Student;

public class StudentConverter {
    // converters = convert the request dto classes into model classes
    public static Student  convertStudentRequestDtoToStudent(StudentRequestDto studentRequestDto){
        Student student = Student.builder().name(studentRequestDto.getName()).email(studentRequestDto.getEmail()).mobile(studentRequestDto.getMobile())
                .age(studentRequestDto.getAge()).grade(studentRequestDto.getGrade()).build();
        return student;
    }
}