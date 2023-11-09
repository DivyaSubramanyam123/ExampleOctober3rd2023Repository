package com.sgtesting.ArrayAssignment;
/*
 * There is a 3*3 String Array,WAP to concatenate all the elements
 */
public class TwoDStringArray {

	public static void main(String[] args) {

		String s[][]= {{"Enjoy","the","festivities"},{"Sending","best","wishes"},{"to","Freinds","Family"}};
		String S1 ="";
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				S1=S1+ " "+ s[i][j];
			}
		}
		System.out.print(S1);
	}
	
}
