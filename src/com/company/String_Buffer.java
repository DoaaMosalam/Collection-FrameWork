package com.company;

import java.util.Scanner;

public class String_Buffer {
    public static String display(){

        StringBuilder sb = new StringBuilder("Welcome to learning java in online from youtube");
        for (int i=0;i<=10000;i++)
            sb.append("Essa");

        return sb.toString();
    }

    public static StringBuilder alterstring(StringBuilder s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                int a = s.charAt(i);
                char ch = (char)(a + 1);
                s.setCharAt(i, ch);
            }
        }
        return s;
    }

    public static void ShowResult(){
        String t;
        StringBuilder sb = new StringBuilder();
        StringBuilder s = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
         s.append(input.nextLine());
        // t= String.valueOf(alterstring(s));
        sb.append(alterstring(s));
        System.out.println(sb);
      //  System.out.println(t);
    }
}
