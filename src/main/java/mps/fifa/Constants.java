package mps.fifa;

public class Constants {

    public enum Layer {
        FIELD,
        ROW,
        CARD
    }

    public enum MoreOrLess {
        MORE,
        LESS
    }

    public enum Target {
        WHOLE_BOARD,
        ENEMY_FIELD,
        YOUR_FIELD
    }

    public enum CardType {
        PLAYER,
        SPELL,
        LEADER
    }
}
