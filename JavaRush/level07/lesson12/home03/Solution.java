package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[20];
        int maximum = 0;
        int minimum = 0;

        //напишите тут ваш код
        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 1; i < intArray.length; i++)
        {
            maximum = intArray[0];
            if (intArray[i] > maximum)
            {
                maximum = intArray[i];
            }
        }

        for (int i = 1; i < intArray.length; i++)
        {
            minimum = intArray[0];
            if (intArray[i] < minimum)
            {
                minimum = intArray[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }

}
