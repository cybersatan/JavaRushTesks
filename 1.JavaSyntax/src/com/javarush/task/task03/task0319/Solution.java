package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number1 = reader.readLine();
        int num1 = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int num2 = Integer.parseInt(number2);
        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
        //напишите тут ваш код

    }
}
