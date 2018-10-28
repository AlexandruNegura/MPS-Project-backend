package mps.fifa.service;

import mps.fifa.model.LeaderCard;
import mps.fifa.model.PlayerCard;
import mps.fifa.model.SpellCard;

import java.util.List;

public interface CardService {

    void addPlayerCards(List<PlayerCard> card);
    void addSpellCards(List<SpellCard> card);
    void addLeaderCards(List<LeaderCard> card);

    List<PlayerCard> findPlayerCards();
    List<SpellCard> findSpellCards();
    List<LeaderCard> findLeaderCards();
}
