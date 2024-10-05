package com.collection.Demo02;

public class Card {
    private static String KING = "\uD83E\uDD34";
    private static String QUEEN = "\uD83D\uDC78";
    private String[] suit ;
    //{"♣","♥","♦","♠"}
    private String[] point;
    //{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};


    public Card() {
    }

    public Card(String[] suit, String[] point) {
        this.suit = suit;
        this.point = point;
    }

    public static String getKING() {
        return KING;
    }

    public static void setKING(String KING) {
        Card.KING = KING;
    }

    public static String getQUEEN() {
        return QUEEN;
    }

    public static void setQUEEN(String QUEEN) {
        Card.QUEEN = QUEEN;
    }

    public String[] getSuit() {
        return suit;
    }

    public void setSuit(String[] suit) {
        this.suit = suit;
    }

    public String[] getPoint() {
        return point;
    }

    public void setPoint(String[] point) {
        this.point = point;
    }
}
