package mps.fifa.service;

import mps.fifa.model.Card;
import mps.fifa.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card findCardById(Long id) {
        return cardRepository.getOne(id);
    }

    @Override
    public void addCard(Card card) {
        cardRepository.save(card);
    }
}
