package mps.fifa.service;

import mps.fifa.model.Card;

public interface CardService {

    Card findCardById(Long id);

    void addCard(Card card);
}
