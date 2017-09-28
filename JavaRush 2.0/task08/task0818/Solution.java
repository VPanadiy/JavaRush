package com.javarush.task.task08.task0818;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() throws IOException {
        //напишите тут ваш код
        HashMap<String,Integer> map = new HashMap(){{
            put("1", 100);
            put("2", 200);
            put("3", 300);
            put("4", 1000);
            put("5", 1020);
            put("6", 1001);
            put("7", 100);
            put("8", 1005);
            put("9", 1004);
            put("10", 100);
        }};
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()) {
            String key = it.next();
            Integer val = map.get(key);
            if (val < 500) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) throws IOException {

    }
}