package com.company.sendfile;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Util {

    public static void fileWriteBytes(String fileName, byte[] data) throws Exception{
        FileOutputStream fop=new FileOutputStream(fileName);
        fop.write(data);
        fop.flush();
        fop.close();
        System.out.println("Done");
    }
    public static String requireString(String title) {
        System.out.println(title);
        return new Scanner(System.in).nextLine();
    }
}
