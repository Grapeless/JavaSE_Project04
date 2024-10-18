package com.NetCommunication.TCP.Test03;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (
                //1.Socket创建TCP客户端Socket对象
                //指向服务器端应用端口号，而非为自己设置
                Socket socket = new Socket("127.0.0.1",8888);

                //2.从Socket对象中得到一个字节输出流对象，用来给服务端发送数据
                OutputStream os = socket.getOutputStream();

                //封装一下该输出流
                DataOutputStream dos = new DataOutputStream(os)
        ) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请说：");
                String str = scanner.next();
                if("exit".equals(str)){
                    break;
                }
                //3.发送数据
                dos.writeUTF(str);
                dos.flush(); //记得刷新,（不是刷新IO流提供的缓冲区，因为这里DataOutputStream没有，而是操作系统的）
                System.out.println("发送成功");
            }
            System.out.println("客户端数据发送完毕");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
