package com.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    //创建一个Logger日志对象 ,slf4j
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");

    public static void main(String[] args) {

        try {
            LOGGER.info("除法方法调用开始");
            divide(10, 0);
            LOGGER.info("除法方法调用完成");
        } catch (Exception e) {
            LOGGER.error("除法方法内出现了bug");
        }

    }

    public static void divide(int a, int b) {
        LOGGER.debug("a{}", a);
        LOGGER.debug("b{}", b);
        int c = a / b;
        LOGGER.info("结果是：" + c);
        //System.out.println("结果是:"+c);
    }

}
