package com.LibraryManagemenSystem.ManagementSystem.repository;

import com.LibraryManagemenSystem.ManagementSystem.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}