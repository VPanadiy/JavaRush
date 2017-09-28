package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder vowelsBuilder = new StringBuilder();
        StringBuilder consonantBuilder = new StringBuilder();
        String word = reader.readLine();
        for (int i = 0; i < word.length(); i++) {
            if (' ' == word.charAt(i)) {
            } else if (isVowel(word.charAt(i))) {
                vowelsBuilder.append(word.charAt(i)).append(" ");
            } else if (!isVowel(word.charAt(i))) {
                consonantBuilder.append(word.charAt(i)).append(" ");
            }
        }
        System.out.println(vowelsBuilder);
        System.out.println(consonantBuilder);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}