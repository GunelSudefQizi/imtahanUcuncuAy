package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Util {
    public static String requireString(String title) {
        System.out.println(title);
        return new Scanner(System.in).nextLine();
    }
    public static byte[] fileReadBytes(String fileName) throws Exception{
        File file=new File(fileName);
        try (FileInputStream fileInputStream=new FileInputStream(file);){
            byte[] bytesArray=new byte[(int) file.length()];
            fileInputStream.read(bytesArray);
            return bytesArray;
        }
    }


}
