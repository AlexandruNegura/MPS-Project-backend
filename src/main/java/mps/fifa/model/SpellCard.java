package mps.fifa.model;

import mps.fifa.Constants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class SpellCard extends Card {

    @Enumerated(EnumType.ORDINAL)
    private Constants.Layer layer;

    @Enumerated(EnumType.ORDINAL)
    private Constants.MoreOrLess moreOrLess;

    @Enumerated(EnumType.ORDINAL)
    private Constants.Target target;

    @Column(name = "targetNationality")
    private String targetNationality;

    @Column(name = "targetClub")
    private String targetClub;

    @Column(name = "threshold")
    private Integer threshold;

    @Column(name = "attack")
    private Integer attack;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "destroy")
    private Boolean destroy;

    public SpellCard(String name,
                     Integer type,
                     Constants.Layer layer,
                     Constants.MoreOrLess moreOrLess,
                     Constants.Target target,
                     String targetNationality,
                     String targetClub,
                     Integer threshold,
                     Integer attack, Integer defense, Boolean destroy) {
        super(name, type);
        this.layer = layer;
        this.moreOrLess = moreOrLess;
        this.target = target;
        this.targetNationality = targetNationality;
        this.targetClub = targetClub;
        this.threshold = threshold;
        this.attack = attack;
        this.defense = defense;
        this.destroy = destroy;
    }

    public Constants.Layer getLayer() {
        return layer;
    }

    public void setLayer(Constants.Layer layer) {
        this.layer = layer;
    }

    public Constants.MoreOrLess getMoreOrLess() {
        return moreOrLess;
    }

    public void setMoreOrLess(Constants.MoreOrLess moreOrLess) {
        this.moreOrLess = moreOrLess;
    }

    public Constants.Target getTarget() {
        return target;
    }

    public void setTarget(Constants.Target target) {
        this.target = target;
    }

    public String getTargetNationality() {
        return targetNationality;
    }

    public void setTargetNationality(String targetNationality) {
        this.targetNationality = targetNationality;
    }

    public String getTargetClub() {
        return targetClub;
    }

    public void setTargetClub(String targetClub) {
        this.targetClub = targetClub;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
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

    public Boolean getDestroy() {
        return destroy;
    }

    public void setDestroy(Boolean destroy) {
        this.destroy = destroy;
    }
}
