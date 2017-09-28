package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            if (sum % 2 == 0) {
                even++;
                sum = 0;
            } else {
                odd++;
                sum = 0;
            }
            num = num / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
