package com.collection.Demo01;

import java.util.ArrayList;
import java.util.Collection;

public class MovieManage {
    private Collection<Movie> movieList = new ArrayList<>();



    public void addMovie(Movie m) {
        movieList.add(m);
    }

    public void display() {
        if (!movieList.isEmpty()) {
            for (Movie movie : movieList) {
                System.out.println("电影：" + movie.getName());
                System.out.println("评分：" + movie.getScore());
                System.out.println("主演：" + movie.getActor());
                System.out.println("-----------------");
            }
        } else System.out.println("暂无信息");
    }



}
