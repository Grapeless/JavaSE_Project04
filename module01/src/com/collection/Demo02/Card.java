package com.collection.Demo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Card implements Comparable<Card> {
    private String suit;
    private String point;

    //"\uD83E\uDD34"
    private static final Card KING = new Card("\uD83E\uDD34", "\uD83E\uDD34");
    //"\uD83D\uDC78"
    private static final Card QUEEN = new Card("\uD83D\uDC78", "\uD83D\uDC78");
    //{"♣","♥","♦","♠"}
    public static final List<String> SUITS = new ArrayList<>(Arrays.asList("♦","♣", "♥", "♠"));
    //{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    public static final List<String> POINTS = new ArrayList<>(Arrays.asList("3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "\uD83E\uDD34", "\uD83D\uDC78"));

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

    public static Card getKing() {
        return KING;
    }

    public static Card getQueen() {
        return QUEEN;
    }

    @Override
    public String toString() {
        return suit + point;
    }

    @Override
    public int compareTo(Card o) {
        if (this.suit.equals("\uD83E\uDD34")) {
            return 1;
        } else if ((this.suit.equals("\uD83D\uDC78"))) {
            if ((!o.suit.equals("\uD83E\uDD34"))) {
                return 1;
            } else return -1;
        } else if (POINTS.indexOf(this.point) > POINTS.indexOf(o.point)) {
            return 1;

        } else if (POINTS.indexOf(this.point) == POINTS.indexOf(o.point)) {
            if (SUITS.indexOf(this.suit) > SUITS.indexOf(o.suit)) {
                return 1;
            } else return -1;
        } else if (POINTS.indexOf(this.point) < POINTS.indexOf(o.point)) {
            return -1;
        } else return 0;
    }
}
