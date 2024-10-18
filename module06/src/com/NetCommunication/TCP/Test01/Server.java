package com.NetCommunication.TCP.Test01;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("---服务端启动成功---");
        try (
                //1.先创建一个TCP服务端ServerSocket对象
                //先为服务端注册一个端口号,服务端Socket对象需指向它
                ServerSocket serverSocket = new ServerSocket(8888);

                //2.阻塞等待客户端连接请求，成功连接返回一个Socket对象
                Socket socket = serverSocket.accept();

                //3.从Socket对象中得到一个字节输入流对象，用来接收服务端数据
                InputStream is = socket.getInputStream();

                //包装一下该输入流与客户端一致
                DataInputStream dis = new DataInputStream(is);
        ) {

            //接收数据
            String str = dis.readUTF();
            System.out.println(str);

            //另外可获取的数据信息
            System.out.println(socket.getRemoteSocketAddress());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
