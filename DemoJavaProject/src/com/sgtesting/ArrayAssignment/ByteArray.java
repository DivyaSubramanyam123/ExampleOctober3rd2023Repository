package com.sgtesting.ArrayAssignment;
/*read elements from the byte array in reverse order*/
public class ByteArray {

	public static void main(String[] args) {
		byte b[]=new byte[4];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		for(int i=b.length-1;i>0;i--)
		{
			System.out.println(b[i]);
		}

	}

}
