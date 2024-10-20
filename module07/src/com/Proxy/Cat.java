package com.Proxy;

public class Cat implements CatProxy {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String eat(String food){
        System.out.println(this.name+" is eating "+food);
        return "Meow~";
    }

    public void touch(){
        System.out.println(this.name+" is being touching");
    }

}
