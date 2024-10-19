package com.NetCommunication.Demo.Demo02;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    ////"客户端发"->服务端收->服务端发->客户端收
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        new ClientReceiveThread(socket).start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = scanner.next();
            if ("exit".equals(msg)) {
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }

        socket.close();
        dos.close();
    }
}
