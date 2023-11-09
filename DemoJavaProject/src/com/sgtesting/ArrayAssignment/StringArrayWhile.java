package com.sgtesting.ArrayAssignment;
/*
 WAP to create string array and read elements from the string array in reverse order using while loop
 */
public class StringArrayWhile {

	public static void main(String[] args) {
		String s[]=new String[4];
		s[0]="MANUAL TESTING";
		s[1]="SQL";
		s[2]="JAVA";
		s[3]="SELENIUM";
		int i=s.length-1;
		while(i>=0)
		{
			System.out.println(s[i]);
			i--;
		}

	}

}
