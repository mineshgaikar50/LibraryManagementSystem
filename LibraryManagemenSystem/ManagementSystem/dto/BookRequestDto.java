package com.LibraryManagemenSystem.ManagementSystem.dto;

import com.LibraryManagemenSystem.ManagementSystem.enums.Genre;
import com.LibraryManagemenSystem.ManagementSystem.model.Author;
import com.LibraryManagemenSystem.ManagementSystem.model.Card;
import com.LibraryManagemenSystem.ManagementSystem.model.Transaction;
import jakarta.persistence.*;
import lombok.Data;


@Data
public class BookRequestDto {

    private String name;
    private int pages;
    private Genre genre;
    private boolean issuedToStudent;
    private int cardID;
    private int authorID;
}
