package com.LibraryManagemenSystem.ManagementSystem.service;


import com.LibraryManagemenSystem.ManagementSystem.model.Card;
import com.LibraryManagemenSystem.ManagementSystem.model.Card;
import com.LibraryManagemenSystem.ManagementSystem.model.Transaction;
import com.LibraryManagemenSystem.ManagementSystem.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    public List<Card> getAllCards(){
        List<Card> cardList = cardRepository.findAll();
        return cardList;
    }
    public Card getCardById(int cardID)
    {
        Optional<Card> cardOptional = cardRepository.findById(cardID);
        Card card = cardOptional.get();
        return card;
    }
}
