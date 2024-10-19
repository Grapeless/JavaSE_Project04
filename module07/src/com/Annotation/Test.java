package com.Annotation;
//javac  .java
//javap  .class
@MyAnnotation01(f2 = 1, f3 = {2, 3, 4})  //5.是一个实现类，实现了该注解接口
public class Test {
    @MyAnnotation02(2)
    private int i = 0;
    @MyAnnotation01(f1 = "yyy", f2 = 2, f3 = {3, 5, 6})
    public static void main(String[] args) {

    }
}
