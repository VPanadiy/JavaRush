package com.javarush.test.level05.lesson12.bonus03;

import org.omg.IOP.RMICustomMaxStreamFormat;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        //напишите тут ваш код
        for (int i = 0; i < N; i++)
        {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int maximum = arr[N - 1];

        System.out.println(maximum);
    }
}
