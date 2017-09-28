package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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
        ABS abs = new ABS();
        abs.FoundABS(a);
        abs.FoundABS(b);
        abs.FoundABS(c);
        System.out.println(abs.getResult());
    }
}

class ABS
{
    private int result = 0;

    public int getResult()
    {
        return result;
    }

    public void setResult(int result)
    {
        this.result = result;
    }

    public void FoundABS(int a)
    {
        if (a > 0)
        {
            setResult(result += 1);
        }
    }
}

