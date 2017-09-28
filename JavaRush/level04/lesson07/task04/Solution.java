package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        PositiveNegative positiveNegative = new PositiveNegative();
        positiveNegative.PosNeg(a);
        positiveNegative.PosNeg(b);
        positiveNegative.PosNeg(c);

        System.out.println("количество отрицательных чисел: " + positiveNegative.getNeg());
        System.out.println("количество положительных чисел: " + positiveNegative.getPos());

    }
}

class PositiveNegative
{
    private int pos = 0;
    private int neg = 0;

    public int getPos()
    {
        return pos;
    }

    public void setPos(int pos)
    {
        this.pos = pos;
    }

    public int getNeg()
    {
        return neg;
    }

    public void setNeg(int neg)
    {
        this.neg = neg;
    }

    public void PosNeg(int a)
    {
        if (a > 0)
        {
            setPos(pos += 1);
        } else
        {
            setNeg(neg += 1);
        }
    }
}
