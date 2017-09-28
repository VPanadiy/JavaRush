package com.javarush.task.task08.task0815;

import java.util.HashMap;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>() {{
            put("1", "Sasha");
            put("2", "Masha");
            put("3", "Dasha");
            put("4", "Sasha");
            put("5", "Masha");
            put("6", "Dasha");
            put("7", "Sasha");
            put("8", "Masha");
            put("9", "Dasha");
            put("10", "Dasha");

        }};
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int i=0;
        for(String s:map.values())if(name.equals(s))i++;
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int i=0;
        for(String s:map.keySet())if(lastName.equals(s))i++;
        return i;
    }

    public static void main(String[] args) {

    }
}
