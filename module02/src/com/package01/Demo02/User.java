package com.package01.Demo02;

import java.time.LocalDate;

public class User {
    private long id;
    private String gender;
    private String name;
    private LocalDate birthday;

    public User() {

    }

    public User(long id, String gender, String name, LocalDate birthday) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "User{" +
                "Id:" + id +
                ", 性别:'" + gender + '\'' +
                ", 姓名:'" + name + '\'' +
                ", 生日:" + birthday +
                '}';
    }
}
