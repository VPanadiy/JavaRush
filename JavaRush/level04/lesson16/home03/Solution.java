package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; ; i++)
        {
            int num = scanner.nextInt();
            if (num == -1)
            {
                sum += num;
                break;
            } else
            {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
