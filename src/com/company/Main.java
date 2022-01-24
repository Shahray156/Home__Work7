package com.company;

import java.time.LocalDate;

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
        printRecommendation(0, 2013);
        System.out.println();
        deliveryDays (14);
        System.out.println("Для доставки требуется " + deliveryDays( 14) + " дней");

    }
    //task 2

    public static void printRecommendation(int clientOS, int deviceYear) {
        boolean releaseDevice = isReleaseDevice(deviceYear);
        System.out.println("Установите ");
        if (releaseDevice) {
            System.out.println("lite");
        }
        System.out.println("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Andriond");
        }
    }

    private static boolean isReleaseDevice(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    // task3
    public static int deliveryDays(int distance) {
        int days = 1;
         if (distance >= 20 && distance <= 60) {
            days++;
        } else if (distance >= 60 && distance < 100) {
            days +=2;
        }
        return days;
    }
}


