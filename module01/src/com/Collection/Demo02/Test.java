package com.Collection.Demo02;

public class Test {
    //♣,♥,♦,♠
    //🤴,👸
    public static void main(String[] args) {
        CardOperator cardOperator = new CardOperator(); //0.

        //展示初始化牌表
        cardOperator.showCardList();
        System.out.println();
        //洗牌
        cardOperator.shuffle();   //1.
        System.out.println("------------------");

        //发牌
        cardOperator.distributeCard();  //2.
        System.out.println(CardOperator.cardList1);
        System.out.println(CardOperator.cardList2);
        System.out.println(CardOperator.cardList3);
        System.out.println("-----------------");
        //排序
        cardOperator.sortCard();  //3.
        System.out.println(CardOperator.cardList1);
        System.out.println(CardOperator.cardList2);
        System.out.println(CardOperator.cardList3);
        System.out.println("------------------");

        //最后三张底牌
        cardOperator.showLastCard();



    }
}
