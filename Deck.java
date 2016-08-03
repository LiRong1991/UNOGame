package simpleunogame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
    
    private ArrayList<Card> deck;
    private int amount;

    public Deck() {
       deck = new ArrayList<Card>();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public int getAmount() {
        amount = deck.size();
        return amount;
    }
      
    public void newDeck(){
        String[]color = {"red","yellow","blue","green",""};
        String[]type = {"Normal","Reverse","Skip","Draw 2","Wild","Wild Draw 4"};
        int []value = {0,1,2,3,4,5,6,7,8,9,20,50};
        
        //Add 1-9 twice
        for(int k = 0;k<2;k++){
            for(int i = 0;i<4;i++){        
                for(int j = 1;j<10;j++){
                    Card a = new Card(color[i],type[0],value[j],color[i]+type[0]+value[j]);             
                    deck.add(a);            
                }
            }
        }
        //add 0 card
        for(int i = 0;i<4;i++){
            Card a = new Card(color[i],type[0],value[0],color[i]+type[0]+value[0]);
            deck.add(a);
        }
        
        //add function card()
        for(int k = 0;k<2;k++){
            for(int i = 0;i<4;i++){
                for(int j = 1;j<4;j++){
                    Card a = new Card(color[i],type[j],value[10],color[i]+type[j]+value[10]);
                    deck.add(a);
                }
            }
        }
        
        //add wild card(8)
        for(int j = 0;j<4;j++){
            for(int i = 4;i<6;i++){
                Card a = new Card(color[4],type[i],value[11],color[4]+type[i]+value[11]);
                deck.add(a);
            }
        }
        Collections.shuffle(deck);              
    }
    
    public Card takeCard(){
        int x = (int)(Math.random()*(deck.size()-1));
        Card card = deck.get(x);
        deck.remove(x); 
        return card;
    }
    
    public void getCard(){
        Iterator i = deck.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
    
}
