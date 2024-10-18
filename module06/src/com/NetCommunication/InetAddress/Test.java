package com.NetCommunication.InetAddress;

import java.net.InetAddress;

public class Test {
    //代表IPd地址
    public static void main(String[] args) throws Exception{
        //1.根据本机IP，返回一个InetAddress对象
        InetAddress inetAddress1 = InetAddress.getLocalHost();
        //2.该InetAddress对象的IP的主机名，域名
        System.out.println(inetAddress1.getHostName());
        //3.该InetAddress对象的IP地址
        System.out.println(inetAddress1.getHostAddress());

        //4.根据指定IP地址或域名，返回一个InetAddress对象
        InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress2.getHostName());
        System.out.println(inetAddress2.getHostAddress());

        //5.是否可达该InetAddress对象中的IP
        System.out.println(inetAddress2.isReachable(2000));

    }
}
