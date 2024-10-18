package com.NetCommunication.UDP.Test01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args)  {
        try(
                //1.DatagramSocket创建UDP客户端Socket对象，插头
                DatagramSocket  socket = new DatagramSocket()  //不写，默认随机一个端口
        ){
            //2.DatagramPacket(...)创建数据包封装要发出去的数据
            /*
              @param   buf     the packet data.
            * @param   length  the packet length.    //字节个数
            * @param   address the destination address.
            * @param   port    the destination port number.
            */
            byte[] bytes = "这是客户端发过来的数据".getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
                    InetAddress.getLocalHost(),8888);

            //3.发送数据包
            socket.send(packet);

            System.out.println("客户端数据发送完毕");
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
