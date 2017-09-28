package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String ss = s.toUpperCase();

        //напишите тут ваш код
        char[] arrayOfChars = s.toCharArray();
        char[] arrayOfUpperCaseChars = ss.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < arrayOfChars.length; i++) {

            if (' ' == arrayOfChars[i]) {
                builder.append(" ");
                flag = true;
            } else {
                if (!flag && i != 0) {
                    builder.append(arrayOfChars[i]);
                } else {
                    builder.append(arrayOfUpperCaseChars[i]);
                    flag = false;
                }
            }
        }
        System.out.println(builder.toString());
    }
}
