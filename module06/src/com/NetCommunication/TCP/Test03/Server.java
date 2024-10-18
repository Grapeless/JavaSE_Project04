package com.NetCommunication.TCP.Test03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("---服务端启动成功---");
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8888);

            while (true) {
                //等待客户端的连接请求
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress()+"上线了");
                //把这个客户端对应的socket交给一个独立的线程处理
                (new ServerThread(socket)).start();  //从左到右执行的到.start时对象已经创建好了，因此可以去掉括号
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                System.out.println("ServerSocket关闭失败");
            }
        }


    }
}
