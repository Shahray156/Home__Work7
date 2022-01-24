package com.company;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printIsleapYear(2013);
        printRecommendation(0, 2013);
        System.out.println();
        deliveryDays (14);
        System.out.println("Для доставки требуется " + deliveryDays( 14) + " дней");
        searchDuplicates ("aabccddefgghiijjkk");
        int [] arr = {3, 2, 1, 6, 5};
        changesArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

    }

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

    //task4
    public static void searchDuplicates(String text) {
        char [] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Найден дубль по символу " +letter);
                return;
            }
            prevChar = letter;
            }
        System.out.println("Дублей не найдено");
        }

    //task5
    public static void changesArray(int[] arr) {
        int first = 0;
        int last =arr.length -1;
        while(first < last) {
            int temp = arr[first];
            arr[first++] = arr [last];
            arr[last--] = temp;
        }
    }
    }


