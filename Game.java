package simpleunogame;

import java.util.ArrayList;

public class Game {
    private String gameID;
    private ArrayList<Player> playerlist;
    private String status;
    private Deck deck;
    private Card discardPile;

    public Game(String gameID, ArrayList<Player> playerlist, String status, Deck deck, Card discardPile) {
        this.gameID = gameID;
        this.playerlist = playerlist;
        this.status = status;
        this.deck = deck;
        this.discardPile = discardPile;
    }
        
    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Player> getPlayerlist() {
        return playerlist;
    }

    public void setPlayerlist(ArrayList<Player> playerlist) {
        this.playerlist = playerlist;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Card getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(Card discardPile) {
        this.discardPile = discardPile;
    }

        
    public void addPlayer(Player p){
        playerlist.add(p);
    }
    
    public Card takeCard() {
        return deck.takeCard();
    }

    public void discardToPile(Card card) {
        this.discardPile = card;
    }

    public Card takeFromPile() {
        Card card = this.discardPile;
        this.discardPile = null;
        return card;
    }

    public void changeStatus(String status) {
        this.status = status;
    }

    
}
