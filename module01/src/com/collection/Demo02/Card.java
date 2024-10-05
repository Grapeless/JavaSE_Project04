package com.collection.Demo02;

public class Card {
    private static final Card KING = new Card("\uD83E\uDD34","\uD83E\uDD34");
    //"\uD83E\uDD34"
    private static final Card QUEEN = new Card("\uD83D\uDC78","\uD83D\uDC78");
    //"\uD83D\uDC78"
    private String suit ;
    //{"♣","♥","♦","♠"}
    private String point;
    //{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};


    public Card() {
    }

    public Card(String suit, String point) {
        this.suit = suit;
        this.point = point;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public static Card getKing(){
        return KING;
    }

    public static Card getQueen(){
        return QUEEN;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
