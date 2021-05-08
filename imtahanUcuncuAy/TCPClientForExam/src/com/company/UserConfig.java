package com.company;

public class UserConfig {
    private static String name;
    private static String surname;



    public UserConfig(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }
}
