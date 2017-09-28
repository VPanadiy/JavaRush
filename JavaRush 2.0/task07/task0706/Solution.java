package com.javarush.task.task07.task0706;

import java.util.Scanner;/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[15];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int even = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            even += array[i];
        }

        int odd = 0;
        for (int i = 1; i < array.length; i = i + 2) {
            odd += array[i];
        }

        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
