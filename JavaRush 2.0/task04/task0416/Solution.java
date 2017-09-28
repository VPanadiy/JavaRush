package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double f = t % 5;
        if (f >= 0 && f < 3) {
            System.out.println("зелёный");
        } else if (f >= 3 && f < 4) {
            System.out.println("желтый");
        } else if (f >= 4 && f < 5) {
            System.out.println("красный");
        }
    }
}