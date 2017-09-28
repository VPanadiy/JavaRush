package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Jessica", "Alba");
        map.put("Alison", "Angel");
        map.put("Ama", "Alba");
        map.put("Viki", "Alison");
        map.put("John", "Dou");
        map.put("Andy", "Dandy");
        map.put("Mark", "Vegetable");
        map.put("Nazomi", "Sasaki");
        map.put("Lovely", "Alison");
        map.put("Heartness", "Alba");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            int sizeBefore = map.size();
            removeItemFromMapByValue(map, pair.getValue());
            if (map.size() == sizeBefore - 1)
                map.put(pair.getKey(), pair.getValue());
        }
    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
