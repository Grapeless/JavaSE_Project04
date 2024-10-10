package com.Collection.Set.HashSet;

import java.util.Objects;

public class Student2 {
    private int age;
    private String name;

    public Student2() {
    }

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //重写equals，只要两个对象内容相同返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age && Objects.equals(name, student2.name);
    }

    //重写hashCode，只要两个对象内容相同，即返回的哈希值就是相同的
    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
