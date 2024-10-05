package com.collection.Demo02;

import java.util.*;

public class CardOperator {
    private List<Card> cardList = new ArrayList<>();
    private List<String> suits = new ArrayList<>();
    //{"♣","♥","♦","♠"}
    private List<String> points = new ArrayList<>();
    //{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

    //准备54张牌
    public CardOperator() {
        cardList.add(Card.getKing());
        cardList.add(Card.getQueen());
        Collections.addAll(suits, "♦", "♣", "♥", "♠");
        Collections.addAll(points, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");
        Iterator<String> i1 = suits.iterator();
        Iterator<String> i2 = points.iterator();
        for (String suit : suits) {
            for (int j = 0; j < 4; j++) {
                cardList.add(new Card(suit, points.get(j)));
            }
        }
    }

    public void showCardList() {
        System.out.println(cardList);
    }

    //洗牌
    public void shuffle() {
        Collections.shuffle(cardList);
    }

    //发牌
    public void distributeCard() {
        for (int i = 0; i < cardList.size() - 3; i += 3) {
            Player.p1.addCard(cardList.get(i));
            Player.p2.addCard(cardList.get(i + 1));
            Player.p3.addCard(cardList.get(i + 2));
        }
    }

    //对牌顺序
    public void sortCard() {
        Collections.sort(Player.p1.getCardList(), new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                if (suits.indexOf(o1.getSuit()) > suits.indexOf(o2.getSuit())) {
                    if (points.indexOf(o1.getPoint()) > points.indexOf(o2.getPoint())) {
                        return 1;
                    } else if (points.indexOf(o1.getPoint()) < points.indexOf(o2.getPoint())) {
                        return -1;
                    } else return 0;
                } else if (suits.indexOf(o1.getSuit()) < suits.indexOf(o2.getSuit())) {
                    return -1;
                } else return 0;
            }
        });
    }

    /*//展示
    public void display() {
    }*/
}
