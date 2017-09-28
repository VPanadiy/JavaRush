package com.javarush.test.level07.lesson09.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            list.add(scanner.nextInt());
        }

        printList(list);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        List<Integer> listMod3 = new ArrayList<>();
        List<Integer> listMod2 = new ArrayList<>();
        List<Integer> listElse = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) % 2 == 0 && list.get(i) % 3 == 0)
            {
                listMod2.add(list.get(i));
                listMod3.add(list.get(i));
            } else if (list.get(i) % 2 == 0)
            {
                listMod2.add(list.get(i));
            } else if (list.get(i) % 3 == 0)
            {
                listMod3.add(list.get(i));
            } else
            {
                listElse.add(list.get(i));
            }
        }

        for (int elements : listMod3)
        {
            System.out.println(elements);
        }

        for (int elements : listMod2)
        {
            System.out.println(elements);
        }

        for (int elements : listElse)
        {
            System.out.println(elements);
        }
    }
}

