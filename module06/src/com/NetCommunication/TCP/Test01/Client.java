package com.NetCommunication.TCP.Test01;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (
                //1.Socket创建TCP客户端Socket对象
                //指向服务器端应用端口号，而非为自己设置
                Socket socket = new Socket("127.0.0.1",8888);

                //2.从Socket对象中得到一个字节输出流对象，用来给服务端发送数据
                OutputStream os = socket.getOutputStream();

                //封装一下该输出流
                DataOutputStream dos = new DataOutputStream(os);
        ) {
            //3.发送数据
            dos.writeUTF("这是客户端发过来的数据");
            System.out.println("客户端数据发送完毕");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
