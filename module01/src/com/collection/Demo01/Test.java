package com.collection.Demo01;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        MovieManage mm = new MovieManage();
        mm.addMovie(new Movie("《肖申克的救赎》", 9.7, "罗宾斯"));
        mm.addMovie(new Movie("《霸王别姬》", 9.6, "张国荣，张丰毅"));
        mm.addMovie(new Movie("《阿甘正传》", 9.5, "汉克斯"));
        //System.out.println(mm.getMovieList());
        mm.display();
        MovieManage mm1 = new MovieManage();
        mm1.display();
    }
}
