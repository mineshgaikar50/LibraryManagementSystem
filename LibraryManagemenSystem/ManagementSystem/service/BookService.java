package com.LibraryManagemenSystem.ManagementSystem.service;

import com.LibraryManagemenSystem.ManagementSystem.dto.BookRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.dto.StudentRequestDto;
import com.LibraryManagemenSystem.ManagementSystem.model.Author;
import com.LibraryManagemenSystem.ManagementSystem.model.Book;
import com.LibraryManagemenSystem.ManagementSystem.model.Card;
import com.LibraryManagemenSystem.ManagementSystem.repository.AuthorRepository;
import com.LibraryManagemenSystem.ManagementSystem.repository.BookRepository;
import com.LibraryManagemenSystem.ManagementSystem.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.LibraryManagemenSystem.ManagementSystem.coverters.BookConverter.convertBookRequestDtoToBook;

@Service // it contains business logic
public class BookService  {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private AuthorRepository authorRepository;


    public String createBook(BookRequestDto bookRequestDto) {
        Book book = new Book();
        book = convertBookRequestDtoToBook(bookRequestDto);

        Card card = cardRepository.findById(bookRequestDto.getCardID()).get();
        book.setCard(card);

        Author author = authorRepository.findById(bookRequestDto.getAuthorID()).get();
        book.setAuthor(author);

        bookRepository.save(book);
        return "Book was saved successfully";
    }
    public List<Book> getAllBooks(){
        List<Book> bookList = bookRepository.findAll();
        return bookList;
    }
    public Book getbookById(int bookID)
    {
        Optional<Book> bookOptional = bookRepository.findById(bookID);
        Book book = bookOptional.get();
        return book;
    }

}
