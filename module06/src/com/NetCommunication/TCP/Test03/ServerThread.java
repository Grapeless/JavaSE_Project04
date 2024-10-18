package com.NetCommunication.TCP.Test03;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private final Socket socket;  //final变量的赋值时机——常量，成员变量，引用成员变量?

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                //获取输入流
                InputStream is = socket.getInputStream();
                DataInputStream dis = new DataInputStream(is)
        ) {
            //不断读数据
            while (true) {
                try {
                    String str = dis.readUTF();

                    System.out.println(str);
                    System.out.println("------------");
                } catch (IOException e) {
                    System.out.println(socket.getRemoteSocketAddress() + "离线了");//客户端的socket被释放了
                    socket.close();  //未在try()中记得关闭
                    break;
                }
            }
            System.out.println("------------");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
