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

    @Column(name = "nationalityDefenseModifier")
    private Integer nationalityDefenseModifier;

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
                      Integer nationalityDefenseModifier,
                      Integer clubAtackModifier,
                      Integer clubDefenseModifier, Integer position) {
        super(name, type, nationality, club);
        this.atack = atack;
        this.defense = defense;
        this.nationalityAtackModifier = nationalityAtackModifier;
        this.nationalityDefenseModifier = nationalityDefenseModifier;
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

    public Integer getNationalityDefenseModifier() {
        return nationalityDefenseModifier;
    }

    public void setNationalityDefenseModifier(Integer nationalityDefenseModifier) {
        this.nationalityDefenseModifier = nationalityDefenseModifier;
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
