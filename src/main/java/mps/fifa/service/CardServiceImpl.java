package mps.fifa.service;

import mps.fifa.model.LeaderCard;
import mps.fifa.model.PlayerCard;
import mps.fifa.model.SpellCard;
import mps.fifa.repository.LeaderCardRepo;
import mps.fifa.repository.PlayerCardRepo;
import mps.fifa.repository.SpellCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private LeaderCardRepo leaderCardRepo;

    @Autowired
    private PlayerCardRepo playerCardRepo;

    @Autowired
    private SpellCardRepo spellCardRepo;

    @Override
    public void addPlayerCards(List<PlayerCard> cards) {
        playerCardRepo.saveAll(cards);
    }

    @Override
    public void addSpellCards(List<SpellCard> cards) {
        spellCardRepo.saveAll(cards);
    }

    @Override
    public void addLeaderCards(List<LeaderCard> cards) {
        leaderCardRepo.saveAll(cards);
    }

    @Override
    public List<PlayerCard> findPlayerCards() {
        return playerCardRepo.findAll();
    }

    @Override
    public List<SpellCard> findSpellCards() {
        return spellCardRepo.findAll();
    }

    @Override
    public List<LeaderCard> findLeaderCards() {
        return leaderCardRepo.findAll();
    }
}
