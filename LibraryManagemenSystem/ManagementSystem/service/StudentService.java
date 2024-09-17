package com.LibraryManagemenSystem.ManagementSystem.service;


import com.LibraryManagemenSystem.ManagementSystem.dto.StudentRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.enums.CardStatus;
import com.LibraryManagemenSystem.ManagementSystem.model.Author;
import com.LibraryManagemenSystem.ManagementSystem.model.Card;
import com.LibraryManagemenSystem.ManagementSystem.model.Student;
import com.LibraryManagemenSystem.ManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.LibraryManagemenSystem.ManagementSystem.coverters.StudentConverter.convertStudentRequestDtoToStudent;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(StudentRequestDto studentRequestDto){
        // create model class object
        Student student = new Student();

        // take requestdto input and set it inside student object
//        student.setName(studentRequestDto.getName());
//        student.setEmail(studentRequestDto.getEmail());
//        student.setAge(studentRequestDto.getAge());
//        student.setMobile(studentRequestDto.getMobile());
//        student.setGrade(studentRequestDto.getGrade());

        student = convertStudentRequestDtoToStudent(studentRequestDto);

        // whenever a student is created a card for the student is also created
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudent(student);

        student.setCard(card);

        // save the student object
        studentRepository.save(student); // when saving student in student Repository even card gets saved in cardRepository through cascading effect

        return "Student and Card added successfully";


    }
    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public  Student getStudentById(int studentID)
    {
        Optional<Student> studentOptional = studentRepository.findById(studentID);
        Student student = studentOptional.get();
        return student;
    }

}
