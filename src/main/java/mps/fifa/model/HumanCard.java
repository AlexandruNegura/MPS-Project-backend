package mps.fifa.model;

import mps.fifa.Constants;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class HumanCard extends Card{
    @Column(name = "nationality")
    private String nationality;

    @Column(name = "club")
    private String club;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public HumanCard() {
    }

    public HumanCard(String name, Constants.CardType type, String nationality, String club) {
        super(name, type);
        this.nationality = nationality;
        this.club = club;
    }
}
