package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        ArrayList<Character> characters = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }

        boolean flag = false;
        for (int i = 0; i < 40; i++) {
            if (' ' == characters.get(i)) {
                flag = true;
            } else {
                for (int j = 0 + i; j < characters.size(); j++) {
                    builder.append(characters.get(j));
                }
                if (flag) {
                    System.out.println(builder.toString());
                    System.out.println(builder.toString());
                    flag=false;
                    builder = new StringBuilder();
                } else {
                    System.out.println(builder.toString());
                    builder = new StringBuilder();
                }
            }
        }
    }

}

