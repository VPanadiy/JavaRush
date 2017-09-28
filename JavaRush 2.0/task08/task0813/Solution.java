package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    private static int index = 0;

    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("Лове".concat(String.valueOf(index)));
            index++;
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<String> set = createSet();
    }
}
