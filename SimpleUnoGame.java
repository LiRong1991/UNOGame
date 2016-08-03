package simpleunogame;



import java.util.ArrayList;
import java.util.List;


public class SimpleUnoGame {

    public static void main(String[] args) {
        // TODO code application logic here
       Deck deck = new Deck();
       deck.newDeck();
       
       List<Player> players = new ArrayList<Player>();
       players.add(new Player("001","A"));
       players.add(new Player("002","B"));
       players.add(new Player("003","C"));
       players.add(new Player("004","D"));
       players.add(new Player("005","E"));
       
       for(Player p: players )
           for(int i = 0; i < 7; i++) {
               p.addHandCards(deck);}            
       
       for(Player p: players )
           p.show();
       
       System.out.println("Remaining number of cards: "+deck.getAmount());
       
       
    }
    
}
