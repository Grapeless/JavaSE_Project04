package com.NetCommunication.Demo.Demo02;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientReceiveThread extends Thread {
    //客户端发->服务端收->服务端发->"客户端收"
    private Socket socket;

    public ClientReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                InputStream is = socket.getInputStream();
                DataInputStream dis = new DataInputStream(is);
        ) {
            while (true) {
                try {
                    String str = dis.readUTF();

                    System.out.println(str);
                    System.out.println("------------");
                } catch (IOException e) {
                    System.out.println(socket.getRemoteSocketAddress() + "离线了");//客户端的socket被释放了
                    Server.sockets.remove(socket);
                    socket.close();  //未在try()中记得关闭
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
