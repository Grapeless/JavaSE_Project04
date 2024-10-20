package com.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//猫猫代理公司
public class ProxyUtil {
    //创建猫猫代理对象
    public static CatProxy createProxy(Cat cat) {   //这里也可以是类似Animal的Cat的父类或接口，
        // 传入后被反射解析为实际子类，拥有子类的全部成员

        //Proxy.newProxyInstance()
        /*
        ClassLoader loader,
        Class<?>[] interfaces,  //代理有什么方法
        InvocationHandler h)  //*用来指定生成的代理对象干什么事情
        */
        CatProxy catProxy = (CatProxy) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{CatProxy.class},
                new InvocationHandler() {
                    //当前调用的代理对象，调用的方法，调用方法的实参
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*if (method.getName().equals("eat")) {
                            System.out.println("代理也喂猫猫!!");
                            return method.invoke(cat, args);
                        } else if (method.getName().equals("touch")){
                            System.out.println("代理也摸猫猫!!");
                            return method.invoke(cat,args);
                        } else {  //代理干不了的事
                            return method.invoke(cat,args);
                        }*/
                        if (method.getName().equals("eat")) {
                            System.out.println("猫猫代理帮你喂猫猫!!");
                        } else if (method.getName().equals("touch")) {
                            System.out.println("猫猫代理帮你摸猫猫!!");
                        }
                        return method.invoke(cat, args);
                    }
                }
        );
        return catProxy;
    }

}
