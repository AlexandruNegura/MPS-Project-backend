# Soccer Card Game Backend
Backend for a soccer card game

## Details

Uses 3 types of cards:
- Leader
- Player
- Spell

Leader cards can influence stats on all player cards.

Spell cards can add atack, defense or destroy other cards.

All the cards are held in the resource folder in the __`CSV_all.csv`__ file. 

Database population with cards is done by GET call on `/populate-db` path.
