package com.LibraryManagemenSystem.ManagementSystem.controller;


import com.LibraryManagemenSystem.ManagementSystem.dto.AuthorRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Author;
import com.LibraryManagemenSystem.ManagementSystem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/create")
    public String createAuthor(@RequestBody AuthorRequestDto authorRequestDto){
        return authorService.createAuthor(authorRequestDto);
    }

    @GetMapping("/findAll")
    public List<Author> getAllAuthors()
    {
        return authorService.getAllAuthors();
    }
}
