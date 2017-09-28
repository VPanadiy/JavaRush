package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int i = 0;
        while (true) {
            double num = scanner.nextDouble();
            if (num == -1) break;
            sum += num;
            i++;
        }
        System.out.println(sum / i);
    }
}

