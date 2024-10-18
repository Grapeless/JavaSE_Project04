package com.NetCommunication.UDP.Test01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) {
        try (
                //1.创建服务端Socket对象，开个门/接头
                DatagramSocket socket = new DatagramSocket(8888)
        ) {
            System.out.println("服务端启动");
            //2.创建数据包对象，用于接收数据
            byte[] bytes = new byte[1024 * 64];  //每个UDP数据报最大64kb
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

            //3.接受数据
            socket.receive(packet);

            //4.从字节数组中把接收到的数据直接打印出来,接受多少读取多少
            int len = packet.getLength();
            String str = new String(bytes,0,len);
            System.out.println(str);

            //另外可获取的数据信息
            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
