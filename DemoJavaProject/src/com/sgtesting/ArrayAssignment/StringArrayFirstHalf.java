package com.sgtesting.ArrayAssignment;
/*
 WAP to create a string array and read first half of the elements
 */
public class StringArrayFirstHalf {

	public static void main(String[] args) {
		String s[]= new String[6];
		s[0]="Developer";
		s[1]="QA";
		s[2]="Product";
		s[3]="OPS";
		s[4]="SALES";
		s[5]="BILLING";
		for(int i=0;i<s.length/2;i++)
		{
			System.out.println(s[i]);
		}

	}

}
