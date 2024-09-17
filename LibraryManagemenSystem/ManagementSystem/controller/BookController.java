package com.LibraryManagemenSystem.ManagementSystem.controller;

import com.LibraryManagemenSystem.ManagementSystem.dto.AuthorRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.dto.BookRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Author;
import com.LibraryManagemenSystem.ManagementSystem.model.Book;
import com.LibraryManagemenSystem.ManagementSystem.service.AuthorService;
import com.LibraryManagemenSystem.ManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public String createAuthor(@RequestBody BookRequestDto bookRequestDto){
        return bookService.createBook(bookRequestDto);
    }

    @GetMapping("/findAll")
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }
}