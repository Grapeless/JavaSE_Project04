package com.Reflect.Demo;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class MyFrame {
    public static void writeField(Object object) throws Exception {
        Class c = object.getClass();
        PrintWriter pw = new PrintWriter(new FileOutputStream
                ("module07/src/com/Reflection/Demo/field.txt", true));
        //打印类名
        pw.println("---------" + c.getSimpleName() + "--------");

        Field[] fields = c.getDeclaredFields();
        //打印属性名及其值
        for (Field field : fields) {
            field.setAccessible(true);
            pw.println(field.getName() + ":" + field.get(object)); //虽然传入的参数类型是 Object，
            // 但反射机制可以在运行时动态地解析出它的实际类型，并操作其成员变量
        }

        pw.close();
    }
}
