package mps.fifa.parser;

import mps.fifa.Constants;
import mps.fifa.model.LeaderCard;
import mps.fifa.model.PlayerCard;
import mps.fifa.model.SpellCard;
import mps.fifa.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Component
public class Parser{
    @Autowired
    private CardService cardService;
    
    List<PlayerCard> playersList;
    List<LeaderCard> leadersList;
    List<SpellCard> spellsList;
    Hashtable<Long, SpellCard> map;
    String fileName;
    
    public Parser() {
    	playersList = new ArrayList<>();
        leadersList = new ArrayList<>();
        spellsList = new ArrayList<>();
        map = new Hashtable<>();
    }
    
    public void parse(String file_name) {
		String csvFile = file_name;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        try {
        	br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), StandardCharsets.UTF_8));
            while ((line = br.readLine()) != null) {
                String[] lineParsed = line.split(cvsSplitBy);
                if (lineParsed[2].equals("0")) {
                	PlayerCard newPlayerCard = new PlayerCard(lineParsed[1], Constants.CardType.PLAYER,
                                                              lineParsed[3], lineParsed[4], Integer.parseInt(lineParsed[5]),
                                                              Integer.parseInt(lineParsed[6]), Integer.parseInt(lineParsed[7]),
                                                              Integer.parseInt(lineParsed[8]), Integer.parseInt(lineParsed[9]),
                                                              Integer.parseInt(lineParsed[10]), lineParsed[11]);
                	newPlayerCard.setId(Long.parseLong(lineParsed[0]));
                	
                	playersList.add(newPlayerCard);
                } else if (lineParsed[2].equals("1")) {
                	LeaderCard newLeaderCard = new LeaderCard(lineParsed[1], Constants.CardType.LEADER,
                			lineParsed[3], lineParsed[4], map.get(Long.parseLong(lineParsed[5])),
                			map.get(Long.parseLong(lineParsed[6])));
                	newLeaderCard.setId(Long.parseLong(lineParsed[0]));
                	leadersList.add(newLeaderCard);
                } else {
                	Constants.Layer layer = Constants.Layer.valueOf(lineParsed[3]);
                	Constants.MoreOrLess moreorless = null;
                	Constants.Target target = null;
                	if (lineParsed[4].compareTo("") != 0)
                		moreorless = Constants.MoreOrLess.valueOf(lineParsed[4]);
                	if (lineParsed[5].compareTo("") != 0)
                		target = Constants.Target.valueOf(lineParsed[5]);
                	SpellCard newSpellCard = new SpellCard(lineParsed[1], Constants.CardType.SPELL, layer, moreorless,
                			target, lineParsed[6], lineParsed[7], Integer.parseInt(lineParsed[8]), Integer.parseInt(lineParsed[9]),
                			Integer.parseInt(lineParsed[10]), Boolean.valueOf(lineParsed[11]));
                	newSpellCard.setId(Long.parseLong(lineParsed[0]));
                	spellsList.add(newSpellCard);
                	map.put(newSpellCard.getId(), newSpellCard);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void printParsedData() {
    	for (PlayerCard p : playersList) {
        	System.out.println(p.getId() + "," + p.getName() + "," + p.getType() + "," + p.getNationality() + "," + p.getClub() + "," +
        			p.getAttack() + "," + p.getDefense() + "," + p.getNationalityAttackModifier() + "," + p.getNationalityDefenseModifier()
        			+ "," + p.getClubAttackModifier() +"," + p.getClubDefenseModifier() + "," + p.getPosition());
        	
        }
        
        for (SpellCard s : spellsList) {
        	System.out.println(s.getId() + "," + s.getName() + "," + s.getType() + "," + s.getLayer() + ","
        			+ s.getMoreOrLess() + "," + s.getTarget() +"," + s.getTargetNationality() + ","
        			+ s.getTargetClub() + "," + s.getThreshold() + "," + s.getAttack() + "," + s.getDefense() +
        			"," + s.getDestroy());
        		
        			
        }
        
        for (LeaderCard l : leadersList) {
        	System.out.println(l.getId() + "," + l.getName() + "," + l.getType() + "," +
        			l.getNationality() + "," + l.getClub() + "," + l.getClub() + "," + l.getPassiveSpell() + "," +
        			l.getActiveSpell());
        }
    }
    
    public void sendParsedDataToDatabase() {
    	cardService.addSpellCards(spellsList);
    	cardService.addLeaderCards(leadersList);
    	cardService.addPlayerCards(playersList);
    }

}
