package mps.fifa.controller;

import mps.fifa.Constants;
import mps.fifa.model.Card;
import mps.fifa.model.LeaderCard;
import mps.fifa.model.PlayerCard;
import mps.fifa.model.SpellCard;
import mps.fifa.parser.Parser;
import mps.fifa.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @Autowired
    private Parser parser;

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/hello")
    String hello(Map<String, Object> model) {
        return "hello";
    }

    @GetMapping(value = "/card")
    ResponseEntity<Map<Constants.CardType, Object> > findCards() {
        Map<Constants.CardType, Object> response = new HashMap<Constants.CardType, Object>() {{
            put(Constants.CardType.PLAYER, cardService.findPlayerCards());
            put(Constants.CardType.LEADER, cardService.findLeaderCards());
            put(Constants.CardType.SPELL, cardService.findSpellCards());
        }};

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/populate-db")
    void populateDb() {
        parser.parse(this.getClass().getClassLoader().getResource("CSV_all.csv").getPath());
        parser.printParsedData();
        parser.sendParsedDataToDatabase();
    }
}
