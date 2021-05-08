package com.company.sendfile;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import static com.company.sendfile.Util.requireString;

public class TCPServer {

    public static void readAsByte()throws Exception{
        ServerSocket serverSocket=new ServerSocket(4545);
        while (true){
            System.out.println("Yeni socket gozleyirem");
            Socket socket=serverSocket.accept();
            System.out.println("Musteri geldi");
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            byte[] arr=readMessage(dataInputStream);
            System.out.println("Message Length 2="+arr.length);
            String path=requireString("Faylinizi hansi qovluga daxil etmek istesez duzgun yazin...");
            Util.fileWriteBytes(path, arr);
        }
    }

    public static byte[] readMessage(DataInputStream din)throws Exception{
        int msgLen=din.readInt();
        System.out.println("Message length 1 "+msgLen);
        byte[] msg=new byte[msgLen];
        din.readFully(msg);
        return msg;
    }
}
