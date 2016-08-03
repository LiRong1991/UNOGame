package simpleunogame;

public class Card {
    private String color;//red,yellow,blue,green
    private String type;//number card,action card(draw two,skip,reverse),wild,wild draw four
    private int value;
    private String image;

    public Card(String color, String type, int value, String image) {
        this.color = color;
        this.type = type;
        this.value = value;
        this.image = image;
    }    

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }


    public String getImage() {
        return image;
    } 

    @Override
    public String toString() {
        return "Card{" + "color=" + color + ", type=" + type + ", value=" + value + ", image=" + image + '}';
    }
    
    
}
