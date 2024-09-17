package com.LibraryManagemenSystem.ManagementSystem.service;

import com.LibraryManagemenSystem.ManagementSystem.dto.AuthorRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Author;
import com.LibraryManagemenSystem.ManagementSystem.model.Card;
import com.LibraryManagemenSystem.ManagementSystem.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.LibraryManagemenSystem.ManagementSystem.coverters.AuthorConverter.convertAuthorRequestDtoToAuthor;

@Service // it contains business logic
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public String createAuthor(AuthorRequestDto authorRequestDto){
        Author author = new Author();
       author = convertAuthorRequestDtoToAuthor(authorRequestDto);
       authorRepository.save(author);
       return "Author saved successfully";

    }

    public List<Author> getAllAuthors(){
        List<Author> authorList = authorRepository.findAll();
        return authorList;
    }

    public Author getAuthorByID(int authorID)
    {
        Optional<Author> authorOptional = authorRepository.findById(authorID);
        Author author = authorOptional.get();
        return author;
    }

}
