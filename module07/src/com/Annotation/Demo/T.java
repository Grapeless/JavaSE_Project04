package com.Annotation.Demo;

import java.lang.reflect.Method;

public class T {
    private void fun(){
        System.out.println("f");
    }

    public static void main(String[] args) throws Exception{
        Test t = new Test();
        Class c = Test.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                method.setAccessible(true);
                method.invoke(t);
            }
        }
    }
}
