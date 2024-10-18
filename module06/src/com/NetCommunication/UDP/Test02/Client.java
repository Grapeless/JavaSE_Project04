package com.NetCommunication.UDP.Test02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)  {
        try(
                //1.DatagramSocket创建客户端Socket对象，插头
                DatagramSocket  socket = new DatagramSocket()  //不写，默认随机一个端口
        ){
            //放在死循环中
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请说：");
                String msg = scanner.next();
                byte[] bytes = msg.getBytes();
                if("exit".equals(msg)){
                    break;
                }

                //2.DatagramPacket(...)创建数据包封装要发出去的数据
                DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
                        InetAddress.getLocalHost(),8888);

                //3.发送数据包
                socket.send(packet);
            }

            System.out.println("客户端数据发送完毕");
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
