package mps.fifa;

import mps.fifa.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class Parser {
    @Autowired
    private CardService cardService;
}
