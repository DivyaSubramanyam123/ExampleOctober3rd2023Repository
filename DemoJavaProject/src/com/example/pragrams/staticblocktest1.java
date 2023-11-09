package com.example.pragrams;
class A123
{
	static 
	{
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[j][i]+ " ");		
			}
			System.out.println();
		}
	}
}
class B123
{
	static 
	{
		System.out.println("static in class B123");
		A123 o=new A123();
	}
}
public class staticblocktest1 {

	public static void main(String[] args) {
		B123 x=new B123();


	}

}
