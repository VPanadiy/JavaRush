package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        List<Integer> elementLength = new ArrayList<>();
        List<Integer> elementLengthCopy = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            list.add(scanner.nextLine());
        }

        for (int i = 0; i < list.size(); i++)
        {
            String temp = list.get(i);
            elementLength.add(temp.length());
        }

        for (int elements : elementLength)
        {
            elementLengthCopy.add(elements);
        }

        Collections.sort(elementLengthCopy);

        for (int i = 0; i < elementLength.size(); i++)
        {
            if (elementLength.get(i) == elementLengthCopy.get(0))
            {
                result.add(list.get(i));
            }
        }

        for (String elements : result)
        {
            System.out.println(elements);
        }

    }
}
