package mps.fifa.controller;

import mps.fifa.model.Card;
import mps.fifa.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/hello")
    String hello(Map<String, Object> model) {
        return "hello";
    }

    @RequestMapping(value = "/card/{id}", method = RequestMethod.GET)
    ResponseEntity<Card> findCard(@PathVariable Long id) {
        return new ResponseEntity<>(cardService.findCardById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/card", method = RequestMethod.POST)
    ResponseEntity<HttpStatus> findCard(@RequestBody Card card) {
        cardService.addCard(card);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
