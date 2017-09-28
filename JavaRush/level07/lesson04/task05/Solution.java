package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] intArray20 = new int[20];
        int[] intFirstArray10 = new int[10];
        int[] intSecondArray10 = new int[10];

        for (int i = 0; i < intArray20.length; i++)
        {
            intArray20[i] = scanner.nextInt();
        }

        for (int i = 0; i < intFirstArray10.length; i++)
        {
            intFirstArray10[i] = intArray20[i];
            intSecondArray10[i] = intArray20[10 + i];
            System.out.println(intSecondArray10[i]);
        }
    }
}
