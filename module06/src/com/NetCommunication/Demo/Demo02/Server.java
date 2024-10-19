package com.NetCommunication.Demo.Demo02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> sockets = new ArrayList<>();
    //客户端发->服务端收->服务端发->客户端收
    public static void main(String[] args) {
        try (
                ServerSocket serverSocket = new ServerSocket(8888);
        ) {
           while (true){
               Socket socket = serverSocket.accept();
               if(!sockets.contains(socket)){
                   sockets.add(socket);
               }
               new ServerThread(socket).start();

           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
