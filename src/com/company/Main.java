package com.company;

public class Main {

    // task1
    public static void leapYear(int year) {
        boolean leapYear = isleapYear(year);
        printIsleapYear(year);
    }

    private static boolean isleapYear(int year) {
        return (((year % 400 == 0) && (year % 100 != 0)) || (year % 4 == 0));
    }

    private static void printIsleapYear(int year) {
        if (isleapYear(year)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    public static void main(String[] args) {
        printIsleapYear(2013);

    }
}


