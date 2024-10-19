package com.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationResolveTest {
    //6.解析注解：判断代码块上是否存在注解，并把其内容解析出来
    //要解析谁上面的注解就应该用谁的对象调用AnnotatedElement接口（都已实现）下的方法进行解析
    public static void main(String[] args) throws Exception {
        Class c = Test.class;

        //1.获取当前对象上的注解数组 getDeclaredAnnotations
        Annotation[] ca = c.getDeclaredAnnotations();
        for (Annotation annotation : ca) {
            MyAnnotation01 myAnnotation01 = annotation instanceof MyAnnotation01
                    ? ((MyAnnotation01) annotation) : null;
            System.out.println(myAnnotation01.f1());
        }
        //2.判断是否存在某个注解 isAnnotationPresent
        //3.获取指定的注解对象 getDeclaredAnnotation
        if(c.isAnnotationPresent(MyAnnotation01.class)){
            MyAnnotation01 myAnnotation01 =
                    (MyAnnotation01) c.getDeclaredAnnotation(MyAnnotation01.class);
            System.out.println(myAnnotation01.f1());
            System.out.println(myAnnotation01.f2());
            System.out.println(Arrays.toString(myAnnotation01.f3()));
        }

        Field field = c.getDeclaredField("i");
        if(field.isAnnotationPresent(MyAnnotation02.class)){
            MyAnnotation02 myAnnotation02 =
                    (MyAnnotation02) field.getDeclaredAnnotation(MyAnnotation02.class);
            System.out.println(myAnnotation02.value());
        }

    }
}
