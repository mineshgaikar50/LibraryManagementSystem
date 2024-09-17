package com.LibraryManagemenSystem.ManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.annotation.Resource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="author")
@Builder
public class Author {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="age", nullable = false)
    private int age;

    @Column(name="country", nullable = false)
    private String country;

    @Column(name="rating", nullable = false)
    private double rating;

    @JsonManagedReference
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> booksOfAuthor = new ArrayList<>();


}
