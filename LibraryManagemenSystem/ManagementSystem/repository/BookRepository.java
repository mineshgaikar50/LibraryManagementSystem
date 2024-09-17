package com.LibraryManagemenSystem.ManagementSystem.repository;

import com.LibraryManagemenSystem.ManagementSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
