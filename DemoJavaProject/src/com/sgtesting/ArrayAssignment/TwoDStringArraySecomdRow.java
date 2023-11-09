package com.sgtesting.ArrayAssignment;
/*
 * Create 2D 3*3 String Array,WAP to read second Row OF Elements
 */
public class TwoDStringArraySecomdRow {

	public static void main(String[] args) {
		String s[][]= {{"Enjoy","the","festivities"},{"Sending","best","wishes"},{"to","Freinds","Family"}};
		/*for(int i=s.length-2;i<=s.length-2;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
		*/
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[1][i]);
		}

	}

}
