package com.collection.Demo02;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cardList = new ArrayList<>();
    public static Player p1 = new Player();
    public static Player p2 = new Player();
    public static Player p3 = new Player();

    public Player() {
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public void addCard(Card c){
        p1.cardList.add(c);
    }

    public void showCardList() {
        System.out.println(p1.cardList);
        System.out.println(p2.cardList);
        System.out.println(p3.cardList);
    }
}