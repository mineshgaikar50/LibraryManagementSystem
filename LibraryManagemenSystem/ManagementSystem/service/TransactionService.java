package com.LibraryManagemenSystem.ManagementSystem.service;


import com.LibraryManagemenSystem.ManagementSystem.dto.TransactionRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Book;
import com.LibraryManagemenSystem.ManagementSystem.model.Card;
import com.LibraryManagemenSystem.ManagementSystem.model.Student;
import com.LibraryManagemenSystem.ManagementSystem.model.Transaction;
import com.LibraryManagemenSystem.ManagementSystem.repository.BookRepository;
import com.LibraryManagemenSystem.ManagementSystem.repository.CardRepository;
import com.LibraryManagemenSystem.ManagementSystem.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.LibraryManagemenSystem.ManagementSystem.coverters.TransactionConverter.convertTransactionRequestDtoToTransaction;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private BookRepository bookRepository;

    public String createTransaction(TransactionRequestDto transactionRequestDto)
    {
        Transaction transaction = new Transaction();
        transaction= convertTransactionRequestDtoToTransaction(transactionRequestDto);

        Card card = cardRepository.findById(transactionRequestDto.getCardID()).get();
        transaction.setCard(card);

        Book book = bookRepository.findById(transactionRequestDto.getBookID()).get();
        transaction.setBook(book);

        transactionRepository.save(transaction);

        return "Transaction Successful";
    }
    public List<Transaction> getAllTransaction(){
        List<Transaction> transactionList = transactionRepository.findAll();
        return transactionList;
    }
    public Transaction getTransactionById(int transactionID)
    {
        Optional<Transaction> transactionOptional =transactionRepository.findById(transactionID);
        Transaction transaction = transactionOptional.get();
        return transaction;
    }

}
