package com.javarush.task.task08.task0814;

import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> setmoreThan10 = new HashSet<Integer>();
        for (Integer moreThan10 : set)
        {
            if (moreThan10 <= 10)
            {
                setmoreThan10.add(moreThan10);
            }
        }
        return setmoreThan10;
    }

    public static void main(String[] args) {
    }
}
