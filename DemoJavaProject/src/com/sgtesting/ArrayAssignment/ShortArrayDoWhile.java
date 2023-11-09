package com.sgtesting.ArrayAssignment;
/*
 * WAP to create short array and read the elements from short array using do while loop
 */
public class ShortArrayDoWhile {

	public static void main(String[] args) {
		Short[] sh= {1,2,3,4,5};
		int i=0;
		do
		{
			System.out.println(sh[i]);	
			i++;
		}while(i<sh.length);

	}

}
