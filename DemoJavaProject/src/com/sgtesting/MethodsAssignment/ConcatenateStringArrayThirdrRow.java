package com.sgtesting.MethodsAssignment;
/* Write a method for the given 3*3 2d String Array concatenate only the third row of the elements 
 * 
 */
class StringArrayConcatrnate
{
	void concatenateThirdRow(String c[][])
	{
		String s1="";
		for(int i=c.length-1;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				s1=s1+" "+c[i][j];
			}
			System.out.println(s1);
		}

	}
}
public class ConcatenateStringArrayThirdrRow {

	public static void main(String[] args) {
		String s[][]= {{"Enjoy","the","festivities"},{"Sending","best","wishes"},{"to","Freinds","Family"}};
		StringArrayConcatrnate obj=new StringArrayConcatrnate();
		obj.concatenateThirdRow(s);
	}

}
