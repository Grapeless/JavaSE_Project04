package com.Annotation;

import java.lang.annotation.*;


//4.元注解
//1.@Target 声明被修饰的注解只能在哪些位置使用
@Target({ElementType.FIELD, ElementType.METHOD})
//2.@Retention 声明注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation02 {
    int value(); //3.特殊属性，当注解中只有一个value属性，在使用注解时,value可以不写
}
