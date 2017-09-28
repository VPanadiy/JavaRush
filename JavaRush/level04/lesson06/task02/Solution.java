package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        scanner.close();
        System.out.println(Max(Max(num1, num2), Max(num3, num4)));
    }

    public static int Max(int a, int b)
    {
        int max;
        if (a > b)
        {
            max = a;
        } else
        {
            max = b;
        }
        return max;
    }
}
