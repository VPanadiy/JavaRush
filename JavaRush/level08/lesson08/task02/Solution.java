package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> setOfInt = new HashSet<>();
        for (int i = 0; i < 20; i++)
        {
            setOfInt.add(i);
        }
        removeAllNumbersMoreThan10(setOfInt);
        return setOfInt;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        for (Integer integer : set)
        {
            if (integer > 10){
                set.remove(integer);
            }
        }
        return set;
    }
}
