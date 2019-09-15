public class Card {
    String suit;
    String number;

    public Card(String suit, String number) {
        this.suit = suit;
        this.number = number;

    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public String getNumber() {
        return number;
    }
}
