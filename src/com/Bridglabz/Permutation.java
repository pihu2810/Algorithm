package com.Bridglabz;

import java.util.Scanner;

public class Permutation {
	static void permute(String s , String answer)
	{  
	    if (s.length() == 0)
	    {
	        System.out.print(answer + "  ");
	        return;
	    }
	     for(int i = 0 ;i < s.length(); i++)
	    {
	        char ch = s.charAt(i);
	        String left = s.substring(0, i);
	        String right = s.substring(i + 1);
	        String rest = left+ right;
	        permute(rest, answer + ch);
	    }
	}
	 

	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
	     System.out.print("Enter the string : ");
	      String s = scan.next();
	      String answer="";
	    System.out.print("All possible strings are : ");
	    permute(s, answer);
	}
	}

