package com.sgtesting.ArrayAssignment;
/*
 * WAP To create char array and read second half of the elements from char array
 */
public class CharArraySecondHalf {

	public static void main(String[] args) {
		char ch[]={'A','B','C','D','E'};
		for(int i=ch.length/2;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
