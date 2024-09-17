package com.LibraryManagemenSystem.ManagementSystem.repository;

import com.LibraryManagemenSystem.ManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}