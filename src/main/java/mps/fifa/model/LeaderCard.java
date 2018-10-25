package mps.fifa.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class LeaderCard extends HumanCard {
    @ManyToOne
    SpellCard passiveSpell;

    @ManyToOne
    SpellCard activeSpell;

    public LeaderCard(String name,
                      Integer type,
                      String nationality,
                      String club,
                      SpellCard passiveSpell,
                      SpellCard activeSpell) {
        super(name, type, nationality, club);
        this.passiveSpell = passiveSpell;
        this.activeSpell = activeSpell;
    }

    public SpellCard getPassiveSpell() {
        return passiveSpell;
    }

    public void setPassiveSpell(SpellCard passiveSpell) {
        this.passiveSpell = passiveSpell;
    }

    public SpellCard getActiveSpell() {
        return activeSpell;
    }

    public void setActiveSpell(SpellCard activeSpell) {
        this.activeSpell = activeSpell;
    }
}
