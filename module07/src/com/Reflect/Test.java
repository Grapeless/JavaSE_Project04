package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    //反射：就是加载类，并允许以编程的方式解析类中的各种成分（成员变量，方法，构造器等（都被封装为对象））
    //即获取类的信息，并操作他们
    //作用：得到一个类的全部成分然后操作它们，可以破坏封装性
    public static void main(String[] args) throws Exception {
        //1.获取Class对象
        //1.1 类名.class
        Class c1 = Student.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        //1.2 Class.forName("全类名")
        Class c2 = Class.forName("com.Reflect.Student");
        System.out.println(c1 == c2);

        //1.3 object.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c2);

        //2.从Class中获取其构造器
        //2.1 获取全部构造器对象，返回构造器对象的数组
        //Constructor[] constructors = c1.getConstructors();只能获取为public的构造器
        Constructor[] constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "-->"+constructor.getParameterCount());
        }

        //2.2 获取指定构造器对象
        //Constructor constructor = c1.getConstructor(String.class,Integer.class);//只能获取为public的构造器
        Constructor constructor = c1.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor.getName()+"-->"+constructor.getParameterCount());

        //2.3 设置为true,表示禁止检查访问控制
        constructor.setAccessible(true);
        //2.4 使用构造器对象，实例化一个类对象
        Student s1 = (Student) constructor.newInstance("盯裆猫", 3);//该构造器是私有的，但仍然成功了
        System.out.println(s1);

        //3.从Class中获取其成员变量
        //3.1 获取全部成员变量对象，返回成员变量对象的数组
        //Field[] fields = c1.getFields();只能获取为public的成员变量
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+"-->"+field.getType());
        }

        //3.2 获取指定成员变量对象
        //Field field = c1.getField("name"); 只能获取为public的成员变量
        Field field = c1.getDeclaredField("name");

        //3.3 设置为true,表示禁止检查访问控制
        field.setAccessible(true);
        //3.4 使用成员变量对象，来进行赋值取值
        field.set(s,"Lim");
        System.out.println(s);

        String name = (String) field.get(s);
        System.out.println(name);

        //4.从Class中获取其方法
        //4.1 获取全部方法对象，返回方法对象的数组
        //Method[] methods = c1.getMethods();//只能获取为public的方法
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+"-->"+method.getReturnType()+"-->"+method.getParameterCount());
        }

        //4.2获取指定方法对象
        //Method method = c1.getMethod("fun",int.class);// 只能获取为Public的方法
        Method method = c1.getDeclaredMethod("fun", int.class);

        //4.3设置为true,表示禁止检查访问控制
        method.setAccessible(true);
        //4.4使用方法对象，来执行对应的方法
        Object object = method.invoke(s,1);  //object中为方法执行的结果
        System.out.println(object);


    }

}
