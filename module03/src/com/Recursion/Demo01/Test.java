package com.Recursion.Demo01;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Bottle> bList = new ArrayList<>();
    public static int numOfLid;
    public static int numOfEmptyBottle;
    public static int sum;

    public static void main(String[] args) {

        int money = 10;
        for (int i = 0; i < (money / 2); i++) {
            bList.add(new Bottle());
        }
        while (!bList.isEmpty()) {
            drink();
            exchange();
        }
        System.out.println(sum);
    }

    public static void drink() {
        numOfLid = numOfLid + bList.size();
        numOfEmptyBottle = numOfEmptyBottle + bList.size();
        sum += bList.size();
        bList.clear();
    }

    public static void exchange() {
        while (numOfLid >= 4) {
            for (int i = 0; i < (numOfLid / 4); i++) {
                bList.add(new Bottle());
            }
            numOfLid = numOfLid % 4;
        }
        while (numOfEmptyBottle >= 2) {
            for (int i = 0; i < (numOfEmptyBottle / 2); i++) {
                bList.add(new Bottle());
            }
            numOfEmptyBottle = numOfEmptyBottle % 2;
        }
    }
}
