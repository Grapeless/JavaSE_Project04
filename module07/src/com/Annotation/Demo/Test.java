package com.Annotation.Demo;

import java.lang.reflect.Method;

public class Test {
    @MyTest
    public void f1() {
        System.out.println("f1");
    }

    public void f2() {
        System.out.println("f2");
    }

    public void f3() {
        System.out.println("f3");
    }

    @MyTest
    private void f4() {
        System.out.println("f4");
    }

    public static void main(String[] args) throws Exception{
        Test t = new Test();
        Class c = Test.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
               // method.setAccessible(true);
                method.invoke(t);
            }
        }




    }

}
