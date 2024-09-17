package com.LibraryManagemenSystem.ManagementSystem.coverters;

import com.LibraryManagemenSystem.ManagementSystem.dto.BookRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.dto.StudentRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Book;

public class BookConverter {
    public static Book convertBookRequestDtoToBook(BookRequestDto bookRequestDto)
    {
        Book book = Book.builder().name(bookRequestDto.getName()).pages(bookRequestDto.getPages())
                .genre(bookRequestDto.getGenre()).issuedToStudent(bookRequestDto.isIssuedToStudent()).build();

        return book;

    }
}
