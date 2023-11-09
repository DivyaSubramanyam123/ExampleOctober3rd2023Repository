package com.sgtesting.ArrayAssignment;
/*
 * there is a integer array it has some elements write a program to find sum of all elements 
 */
public class SumOfArrayElements {

	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
