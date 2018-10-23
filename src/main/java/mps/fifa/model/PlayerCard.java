package mps.fifa.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PlayerCard extends HumanCard {
    @Column(name = "atack")
    private Integer atack;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "nationalityAtackModifier")
    private Integer nationalityAtackModifier;

    @Column(name = "nationalotyDefenseModifier")
    private Integer nationalotyDefenseModifier;

    @Column(name = "clubAtackModifier")
    private Integer clubAtackModifier;

    @Column(name = "clubDefenseModifier")
    private Integer clubDefenseModifier;

    @Column(name = "position")
    private Integer position;

    public PlayerCard(String name,
                      Integer type,
                      String nationality,
                      String club,
                      Integer atack,
                      Integer defense,
                      Integer nationalityAtackModifier,
                      Integer nationalotyDefenseModifier,
                      Integer clubAtackModifier,
                      Integer clubDefenseModifier, Integer position) {
        super(name, type, nationality, club);
        this.atack = atack;
        this.defense = defense;
        this.nationalityAtackModifier = nationalityAtackModifier;
        this.nationalotyDefenseModifier = nationalotyDefenseModifier;
        this.clubAtackModifier = clubAtackModifier;
        this.clubDefenseModifier = clubDefenseModifier;
        this.position = position;
    }

    public Integer getAtack() {
        return atack;
    }

    public void setAtack(Integer atack) {
        this.atack = atack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getNationalityAtackModifier() {
        return nationalityAtackModifier;
    }

    public void setNationalityAtackModifier(Integer nationalityAtackModifier) {
        this.nationalityAtackModifier = nationalityAtackModifier;
    }

    public Integer getNationalotyDefenseModifier() {
        return nationalotyDefenseModifier;
    }

    public void setNationalotyDefenseModifier(Integer nationalotyDefenseModifier) {
        this.nationalotyDefenseModifier = nationalotyDefenseModifier;
    }

    public Integer getClubAtackModifier() {
        return clubAtackModifier;
    }

    public void setClubAtackModifier(Integer clubAtackModifier) {
        this.clubAtackModifier = clubAtackModifier;
    }

    public Integer getClubDefenseModifier() {
        return clubDefenseModifier;
    }

    public void setClubDefenseModifier(Integer clubDefenseModifier) {
        this.clubDefenseModifier = clubDefenseModifier;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
