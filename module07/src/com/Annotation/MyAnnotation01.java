package com.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//1.注解：让其他代码块根据注解信息决定怎么执行它
//2.自定义注解：public 属性类型，属性名()，default defaultValue;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation01 {

    String f1() default "嘤嘤嘤";
    int f2() ;
    int[] f3() ;
}
//5.注解本质是一个接口，继承了Annotation接口
/*
public interface MyAnnotation extends Annotation{
    public abstract String f1();
    public abstract int f2();
    public abstract int[] f3();
}
 */

