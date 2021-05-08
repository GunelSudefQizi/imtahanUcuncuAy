package com.company;

import static com.company.Util.requireString;

public class Main {
    public static void main(String[] args) throws Exception {
        UserConfig userConfig = new UserConfig(requireString("Adinizi daxil edin:"),
                requireString("Soyadinizi daxil edin:"));
        TCPClient.tcpClient();
    }
}
