package mps.fifa.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import mps.fifa.Constants;

import javax.persistence.*;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.ANY,
                isGetterVisibility = JsonAutoDetect.Visibility.ANY)
@MappedSuperclass
public class Card extends Id{

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private Constants.CardType type;

    public Card() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Constants.CardType getType() {
        return type;
    }

    public void setType(Constants.CardType type) {
        this.type = type;
    }

    public Card(String name, Constants.CardType type) {
        this.name = name;
        this.type = type;
    }
}
