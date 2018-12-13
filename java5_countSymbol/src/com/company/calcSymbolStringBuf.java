package com.company;

import java.util.Scanner;

public class calcSymbolStringBuf {
    public static void main(String[] args) {
//        System.out.print("Enter string -> ");
//        Scanner str = new Scanner(System.in);
//        StringBuffer s = new StringBuffer(str.nextLine());
        StringBuffer s = new StringBuffer("++++----****");
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '+')
                count++;
            else if(s.charAt(i) == '-')
                count++;
            else if(s.charAt(i) == '*')
                count++;
        }

        System.out.print("Общее кол-во символов - " + count);
        s.delete(0, s.length());
        System.out.println(s);
    }
}
