package com.LibraryManagemenSystem.ManagementSystem.coverters;


import com.LibraryManagemenSystem.ManagementSystem.dto.AuthorRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Author;

public class AuthorConverter {
    // converters = convert the request dto classes into model classes
    public static Author convertAuthorRequestDtoToAuthor(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().name(authorRequestDto.getName()).age(authorRequestDto.getAge())
                .country(authorRequestDto.getCountry()).rating(authorRequestDto.getRating()).build();
        return author;
    }
}