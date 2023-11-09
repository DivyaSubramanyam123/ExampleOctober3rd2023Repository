package com.sgtesting.array;

public class CharArray {

	public static void main(String[] args) {
		char[][] ch= {{'J','A','V'},{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}

}
