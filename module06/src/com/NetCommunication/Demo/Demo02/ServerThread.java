package com.NetCommunication.Demo.Demo02;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
    //客户端发->"服务端收->服务端发"->客户端收
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try (
                InputStream is = socket.getInputStream();
                DataInputStream dis = new DataInputStream(is)
        ) {
            try {
                while (true) {
                    try {
                        String str = dis.readUTF();
                        sentMsg(str);
                        System.out.println(str);
                        System.out.println("------------");
                    } catch (IOException e) {
                        System.out.println(socket.getRemoteSocketAddress() + "离线了");//客户端的socket被释放了
                        socket.close();  //未在try()中记得关闭
                        break;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void sentMsg(String msg) {
        for (Socket socket : Server.sockets) {
            try (
                    OutputStream os = socket.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os)
            ) {
                dos.writeUTF(msg);
                dos.flush();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
