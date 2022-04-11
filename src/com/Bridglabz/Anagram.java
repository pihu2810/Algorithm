package com.Bridglabz;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	public static boolean Arrangement(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2) {
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the first String = ");
    	String s1=sc.next();
    	System.out.println("Enter the first String = ");
    	String s2=sc.next();
    	sc.close();
        if (Arrangement(s1.toCharArray(), s2.toCharArray()))
            System.out.println("The two strings are" + " equal of each other");
        else
            System.out.println("The two strings are not" + " not equal of each other");
    }
}
