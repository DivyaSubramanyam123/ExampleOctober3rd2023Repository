package com.sgtesting.array;

public class TwoDimensinalArray {

	public static void main(String[] args) {
		String[][] s= {{"Java","Selenium","Automation"},{"Manual","Testing","testcase"},{"Sql","Database","Query"}};

		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++ )
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}

}
