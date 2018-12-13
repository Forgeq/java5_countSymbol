package com.company;

import java.util.Scanner;

//        В заданной последовательности символов подсчитать общее количество
//        символов "+", "-", "*" и исключить их из текста
public class Main {
    public static void main(String[] args) {
//        System.out.print("Enter string -> ");
//        Scanner str = new Scanner(System.in);
//        String s = new String(str.nextLine()); // Explicit construction via new
        String s = "++++----****";
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '+')
                count++;
            else if(s.charAt(i) == '-')
                count++;
            else if(s.charAt(i) == '*')
                count++;
        }

        System.out.print("The symbol is found " + count + " " + s.replaceAll("^([\\*\\-\\+]+)$", " "));
    }
}
