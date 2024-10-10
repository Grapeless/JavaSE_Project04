package com.Demo.Demo04;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        //考研时间
        final LocalDateTime FINAL_DATE = LocalDateTime.of(2024, 12, 21, 9, 0);
        //现在的时间
        LocalDateTime now = LocalDateTime.now();
        //格式化对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        System.out.println("        " + FINAL_DATE.getYear() + "年考研倒计时" + "        ");
        //在字符串中插入一段字符串
        //String str = now.format(dtf).substring(0,5)+"考研时间"+now.format(dtf).substring(5);
        System.out.println(FINAL_DATE.getYear() + "年考研时间:" +
                FINAL_DATE.format(dtf) + " 星期" + FINAL_DATE.getDayOfWeek().getValue());
        System.out.println("现在距离" + FINAL_DATE.getYear() + "年考研还有：");


        Duration d = Duration.between(now, FINAL_DATE); //Duration 可获取d,h,m,s,nanos
        long day = d.toDays();
        long hour = d.toHours() - d.toDays() * 24;
        long minute = d.toMinutes() - d.toHours() * 60;
        long sec = d.toSeconds() - d.toMinutes() * 60;

        System.out.println(day + "天" + hour + "时" + minute + "分" + sec + "秒");


    }
}
