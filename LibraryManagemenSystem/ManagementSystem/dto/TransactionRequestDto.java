package com.LibraryManagemenSystem.ManagementSystem.dto;


import com.LibraryManagemenSystem.ManagementSystem.enums.TransactionStatus;
import lombok.Data;

@Data
public class TransactionRequestDto {

    private TransactionStatus transactionStatus;
    private double fine;
    private boolean issueOperation;
    private int cardID;
    private int bookID;

}
