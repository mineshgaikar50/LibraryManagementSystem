package com.LibraryManagemenSystem.ManagementSystem.controller;


import com.LibraryManagemenSystem.ManagementSystem.dto.TransactionRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Book;
import com.LibraryManagemenSystem.ManagementSystem.model.Transaction;
import com.LibraryManagemenSystem.ManagementSystem.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/create")
    public String addTransaction(@RequestBody TransactionRequestDto transactionRequestDto){
        return transactionService.createTransaction(transactionRequestDto);
    }


    @GetMapping("/findAll")
    public List<Transaction> getAllTransaction()
    {
        return transactionService.getAllTransaction();
    }
}
