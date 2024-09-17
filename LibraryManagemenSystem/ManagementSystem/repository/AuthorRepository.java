package com.LibraryManagemenSystem.ManagementSystem.repository;

import com.LibraryManagemenSystem.ManagementSystem.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // it does the database operations
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}