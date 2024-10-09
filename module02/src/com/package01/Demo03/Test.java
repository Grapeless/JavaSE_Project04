package com.package01.Demo03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static final LocalDate originDate = LocalDate.of(2022, 2, 3);
    public static final List<LocalDate> aimDateList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("请输入查询月份(于2022.02之后,包括2月(格式:xxxx.xx))：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();  //"yyyy.MM"
        fun1(str);    //输出目标月全部符合条件的日子
        fun2();       //输出从fun1中得到的日子筛选出的为双休的日子
    }

    public static void fun1(String str) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        str += ".01";   //为了符合parse方法要求，该天数实际无用处
        LocalDate date = LocalDate.parse(str, dtf);
        int year = date.getYear();
        int month = date.getMonthValue();

        LocalDate tempDate = originDate;   //init tempDate = 2022.02.03
        while (tempDate.isBefore(LocalDate.of(year, month + 1, 1))) {    //tempDate小于目标日期的下一个月
            if (tempDate.isAfter(LocalDate.of(year, month, 1).minusDays(1))) {   //tempDate迭代到目标月
                System.out.print(tempDate + " ");
                if (tempDate.getDayOfWeek() == DayOfWeek.SATURDAY || tempDate.getDayOfWeek() == DayOfWeek.SUNDAY){
                    aimDateList.add(tempDate);
                }
            }
            tempDate = tempDate.plusDays(3);  //每两天休息一天
            //1，2，3，4，5，6
        }
        System.out.println();
    }

    public static void fun2() {
        System.out.print("其中为双休的日子有：");
        for (LocalDate localDate : aimDateList) {
            System.out.print(localDate+" ");
        }
    }
}
