package com.sgtesting.methodreturn;
/*
 * 5)Write a method for the given 2D String Array it has to return the concatenation result
 */
class ArrayConcat
{
	String displayconcatenate(String a[][])
	{

		String s1="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				s1=s1+" "+a[i][j];
			}
		}
		return s1;
	}
}
public class StringArrayConcatenation {
	public static void main(String[] args) {
		String s[][]= {{"Enjoy","the","festivities"},{"Sending","best","wishes"},{"to","Freinds","Family"}};
		ArrayConcat obj=new ArrayConcat();
		String s2=obj.displayconcatenate(s);
		System.out.print(s2);

	}

}
