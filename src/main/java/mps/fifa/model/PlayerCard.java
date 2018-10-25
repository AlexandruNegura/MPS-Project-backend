package mps.fifa.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PlayerCard extends HumanCard {
    @Column(name = "attack")
    private Integer attack;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "nationalityAttackModifier")
    private Integer nationalityAttackModifier;

    @Column(name = "nationalityDefenseModifier")
    private Integer nationalityDefenseModifier;

    @Column(name = "clubAttackModifier")
    private Integer clubAttackModifier;

    @Column(name = "clubDefenseModifier")
    private Integer clubDefenseModifier;

    @Column(name = "position")
    private String position;

    public PlayerCard(String name,
                      Integer type,
                      String nationality,
                      String club,
                      Integer attack,
                      Integer defense,
                      Integer nationalityAttackModifier,
                      Integer nationalityDefenseModifier,
                      Integer clubAttackModifier,
                      Integer clubDefenseModifier, String position) {
        super(name, type, nationality, club);
        this.attack = attack;
        this.defense = defense;
        this.nationalityAttackModifier = nationalityAttackModifier;
        this.nationalityDefenseModifier = nationalityDefenseModifier;
        this.clubAttackModifier = clubAttackModifier;
        this.clubDefenseModifier = clubDefenseModifier;
        this.position = position;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getNationalityAttackModifier() {
        return nationalityAttackModifier;
    }

    public void setNationalityAttackModifier(Integer nationalityAttackModifier) {
        this.nationalityAttackModifier = nationalityAttackModifier;
    }

    public Integer getNationalityDefenseModifier() {
        return nationalityDefenseModifier;
    }

    public void setNationalityDefenseModifier(Integer nationalityDefenseModifier) {
        this.nationalityDefenseModifier = nationalityDefenseModifier;
    }

    public Integer getClubAttackModifier() {
        return clubAttackModifier;
    }

    public void setClubAttackModifier(Integer clubAttackModifier) {
        this.clubAttackModifier = clubAttackModifier;
    }

    public Integer getClubDefenseModifier() {
        return clubDefenseModifier;
    }

    public void setClubDefenseModifier(Integer clubDefenseModifier) {
        this.clubDefenseModifier = clubDefenseModifier;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
