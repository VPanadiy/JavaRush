package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone7", new Date("JANUARY 1 1980"));
        map.put("Stallone5", new Date("FEBRUARY 1 1980"));
        map.put("Stallone3", new Date("MARCH 1 1980"));
        map.put("Stallone4", new Date("APRIL 1 1980"));
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JULY 1 1980"));
        map.put("Stallone8", new Date("AUGUST 1 1980"));
        map.put("Stallone9", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone10", new Date("NOVEMBER 1 1980"));
        map.put("Stallone6", new Date("DECEMBER 1 1980"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Date> para = iterator.next();
            if (para.getValue().getMonth()>4 && para.getValue().getMonth()<8){iterator.remove();}
        }
    }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
