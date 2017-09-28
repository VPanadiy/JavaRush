package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Jessica", "Alba");
        map.put("Alison", "Angel");
        map.put("Jessica", "Alba");
        map.put("Viki", "Angel");
        map.put("John", "Dou");
        map.put("Andy", "Dandy");
        map.put("Amy", "Viki");
        map.put("Nazomi", "Sasaki");
        map.put("Alison", "Angel");
        map.put("Jessica", "Alba");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
