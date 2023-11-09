package com.sgtesting.ArrayAssignment;
/*
 * WAP to create long array and read second half of the elements by applying do while loop
 */
public class LongArraySecondHalfDo {

	public static void main(String[] args) {
		Long l[]=new Long[6];
		l[0]=12L;
		l[1]= 13L;
		l[2]= 14L;
		l[3]= 15L;
		l[4]= 16L;
		l[5]= 17L;
		int i=l.length/2;
		do
		{
			System.out.println(l[i]);
			i++;
		}while(i<l.length);


	}

}
