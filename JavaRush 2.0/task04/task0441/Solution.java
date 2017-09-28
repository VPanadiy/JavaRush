package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = max(num1, num2, num3);
        int min = min(num1, num2, num3);
        int average = average(num1, num2, num3, max, min);
        System.out.println(average);
    }

    public static int max(int num1, int num2, int num3) {
        int max = num1;
        if (num1 < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return max;
    }

    public static int min(int num1, int num2, int num3) {
        int min = num1;
        if (num1 > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        return min;
    }

    public static int average(int num1, int num2, int num3, int max, int min) {
        int average = 0;
        if (num1 == max && num2 == min || num2 == max && num1 == min) {
            average = num3;
        } else if (num2 == max && num3 == min || num3 == max && num2 == min) {
            average = num1;
        } else if (num1 == max && num3 == min || num3 == max && num1 == min) {
            average = num2;
        }
        return average;
    }
}
