package com.LibraryManagemenSystem.ManagementSystem.coverters;

import com.LibraryManagemenSystem.ManagementSystem.dto.TransactionRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Transaction;

import java.util.UUID;

public class TransactionConverter {
    public static Transaction convertTransactionRequestDtoToTransaction(TransactionRequestDto transactionRequestDto)
    {
        Transaction transaction = Transaction.builder().transactionStatus(transactionRequestDto.getTransactionStatus()).fine(transactionRequestDto.getFine())
                .transactionId(UUID.randomUUID().toString()).isIssueOperation(transactionRequestDto.isIssueOperation()).build();

        return transaction;
    }
}
