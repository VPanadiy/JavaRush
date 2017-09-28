package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String s = "S";
        int i1 = 10;
        while (i1 > 0)
        {
            int ii = 10;
            while (ii > 0)
            {
                System.out.print(s);
                ii--;
            }
            System.out.println();
            i1--;
        }
    }
}
