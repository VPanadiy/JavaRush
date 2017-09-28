package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(Average(a, b, c));
    }

    public static int Min(int a, int b)
    {
        return (a <= b) ? a : b;
    }

    public static int Max(int a, int b)
    {
        return (a >= b) ? a : b;
    }

    public static int Average(int a, int b, int c)
    {
        int result = 0;
        int min = Min(c, Min(a, b));
        int max = Max(c, Max(a, b));
        if (min == a && max == b || min == b && max == a)
        {
            result = c;
        }
        if (min == a && max == c || min == c && max == a)
        {
            result = b;
        }
        if (min == b && max == c || min == b && max == a)
        {
            result = a;
        }
        return result;
    }
}
