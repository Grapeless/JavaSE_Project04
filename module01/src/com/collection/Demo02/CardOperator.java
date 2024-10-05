package com.collection.Demo02;

import java.util.*;

public class CardOperator {
    private List<Card> cardList = new ArrayList<>();
    public static List<Card> cardList1 = new ArrayList<>();
    public static List<Card> cardList2 = new ArrayList<>();
    public static List<Card> cardList3 = new ArrayList<>();

    //0.准备54张牌
    public CardOperator() {
        cardList.add(Card.getKing());
        cardList.add(Card.getQueen());

        Iterator<String> i1 = Card.SUITS.iterator();
        Iterator<String> i2 = Card.POINTS.iterator();
        for (int i = 0; i < Card.POINTS.size() - 2; i++) {
            for (int j = 0; j < 4; j++) {
                cardList.add(new Card(Card.SUITS.get(j), Card.POINTS.get(i)));
            }
        }
    }


    //1.洗牌
    public void shuffle() {
        Collections.shuffle(cardList);
        showCardList();
    }

    //2.发牌
    public void distributeCard() {
        for (int i = 0; i < cardList.size() - 3; i += 3) {
            cardList1.add(cardList.get(i));
            cardList2.add(cardList.get(i + 1));
            cardList3.add(cardList.get(i + 2));
        }
    }

    //3.对牌顺序
    public void sortCard() {
        Collections.sort(cardList1);
        Collections.sort(cardList2);
        Collections.sort(cardList3);
    }


    //输出牌组信息
    public void showCardList() {
        System.out.println(cardList.get(0).getSuit() + cardList.get(0).getPoint());
        System.out.println(cardList.get(1).getSuit() + cardList.get(1).getPoint());
        int i = 0;
        for (int j = 2; j < cardList.size(); j++) {
            System.out.print(cardList.get(j).getSuit() + cardList.get(j).getPoint() + " ");
            i++;
            if (i % 4 == 0) {
                System.out.println();
                i = 0;
            }
        }
    }

    //底牌展示
    public void showLastCard() {
        System.out.println("总张数："+cardList.size());
        System.out.println("P1张数："+cardList1.size());
        System.out.println("P2张数："+cardList2.size());
        System.out.println("P3张数："+cardList3.size());
        System.out.println("P1+P2+P3张数:"+(cardList1.size()+cardList2.size()+cardList3.size()));
        System.out.print("底牌：");
        System.out.print(cardList.get(51).getSuit() + cardList.get(51).getPoint() + " ");
        System.out.print(cardList.get(52).getSuit() + cardList.get(52).getPoint() + " ");
        System.out.print(cardList.get(53).getSuit() + cardList.get(53).getPoint());
    }








    /*
    if (suits.indexOf(o1.getSuit()) > suits.indexOf(o2.getSuit())) {
                    if (points.indexOf(o1.getPoint()) > points.indexOf(o2.getPoint())) {
                        return 1;
                    } else if (points.indexOf(o1.getPoint()) < points.indexOf(o2.getPoint())) {
                        return -1;
                    } else return 0;
                } else if (suits.indexOf(o1.getSuit()) < suits.indexOf(o2.getSuit())) {
                    return -1;
                } else return 0;
    */
}
