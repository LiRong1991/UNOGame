package simpleunogame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
    
    private String name;
    private String id;
    private List<Card> handCards;

    public Player(String name,String id) {
        this.name = name;
        this.id = id;
        this.handCards = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHandCards() {
        return handCards;
    }
    
    public void setHandCards(List<Card> handCards) {
        this.handCards = handCards;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addHandCards(Deck d){
        
        handCards.add(d.takeCard());
        
    }
    
    public void removeHandCards(Card c){
        
        this.handCards.remove(c);
        
    }
    
    public void showHandCards(){
        
        Iterator<Card> i = handCards.iterator();
                while(i.hasNext())
                    System.out.println(i.next());
    }
    
    public void show(){
        System.out.println(this.name);
        showHandCards();
    }
    
}
