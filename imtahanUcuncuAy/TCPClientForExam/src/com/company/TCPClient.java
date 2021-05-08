package com.company;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import static com.company.Util.*;

public class TCPClient {

    public static void tcpClient()throws Exception {
        String str=requireString("Fayli gondermek istediyiniz (serverin) ip və portunu " +
                "arasina :(qosha noqte) qoymaqla daxil edin...");
        String[] arr = str.split(":");
        String ip = arr[0];
        int port = Integer.parseInt(arr[1]);
        Socket socket=new Socket(ip,port);
        System.out.println(UserConfig.getName()+" "+UserConfig.getSurname()+" Duzgun daxil oldunuz");
        OutputStream outputStream=socket.getOutputStream();
        DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
        System.out.println("Secmek istediyiniz faylin yolunu duzgun yazin");
        String path=new Scanner(System.in).nextLine();
        byte[] bytes= Util.fileReadBytes(path);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        System.out.println("Servere melumat gonderildi");
        socket.close();
    }
}
