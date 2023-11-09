package com.sgtesting.ArrayAssignment;
/*
 * WAP to create float array and read second half of the elements using while loop
 */
public class FloatArraySecondHalfWhile {

	public static void main(String[] args) {
		float[] f=new float[6];
		f[0]=12.5f;
		f[1]=13.5f;
		f[2]=14.5f;
		f[3]=15.5f;
		f[4]=16.5f;
		f[5]=17.5f;
		int i=f.length/2;
		while(i<f.length)
		{
			System.out.println(f[i]);
			i++;
		}
	}

}
