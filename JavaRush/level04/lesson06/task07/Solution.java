package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;
import java.util.Scanner;

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
        System.out.println(NumEven(a, b, c));
    }

    public static int NumEven(int a, int b, int c)
    {
        int result;
        if (a == b)
        {
            result = 3;
        } else if (b == c)
        {
            result = 1;
        } else if (a == c)
        {
            result = 2;
        } else
        {
            result = 0;
        }
        return result;
    }
}
