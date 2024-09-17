package com.LibraryManagemenSystem.ManagementSystem.controller;

import com.LibraryManagemenSystem.ManagementSystem.dto.BookRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Book;
import com.LibraryManagemenSystem.ManagementSystem.model.Card;
import com.LibraryManagemenSystem.ManagementSystem.service.BookService;
import com.LibraryManagemenSystem.ManagementSystem.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

//    @PostMapping("/create")
//    public String createAuthor(@RequestBody BookRequestDto bookRequestDto){
//        return bookService.createBook(bookRequestDto);
//    }

    @GetMapping("/findAll")
    public List<Card> getAllCards()
    {
        return cardService.getAllCards();
    }
}
