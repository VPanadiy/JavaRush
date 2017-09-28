package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; ; i++)
        {
            String num = bufferedReader.readLine();
            if (num.equals("сумма"))
            {
                break;
            } else
            {
                int intNum = Integer.parseInt(num);
                sum += intNum;
            }
        }
        System.out.println(sum);
    }
}
