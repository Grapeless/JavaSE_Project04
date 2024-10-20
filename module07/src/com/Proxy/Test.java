package com.Proxy;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("盯裆🐱");  //创建一个猫猫
        CatProxy catProxy = ProxyUtil.createProxy(cat);  //创建一个猫猫代理
        String str = catProxy.eat("Fish");  //使用猫猫代理调用猫猫的方法
        System.out.println(str);
        catProxy.touch();
    }
}
