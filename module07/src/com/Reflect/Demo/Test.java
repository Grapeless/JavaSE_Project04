package com.Reflect.Demo;

public class Test {
    public static void main(String[] args) throws Exception{
        Student s = new Student("Lim",20,170.0,110.0);
        Teacher t = new Teacher("Alex",35,10000);

        MyFrame.writeField(s);
        MyFrame.writeField(t);

    }
}
