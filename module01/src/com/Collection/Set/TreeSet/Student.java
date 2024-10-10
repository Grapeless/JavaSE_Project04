package com.Collection.Set.TreeSet;

public class Student implements Comparable<Student>{
    private int age;
    private double height;

    public Student() {
    }

    public Student(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }

    //重写compareTo方法，按照年龄升序排序
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
