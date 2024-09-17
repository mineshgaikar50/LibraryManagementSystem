package com.LibraryManagemenSystem.ManagementSystem.dto;

import jakarta.persistence.Column;
import lombok.Data;


@Data
public class AuthorRequestDto {

    private String name;
    private int age;
    private String country;
    private double rating;

}
