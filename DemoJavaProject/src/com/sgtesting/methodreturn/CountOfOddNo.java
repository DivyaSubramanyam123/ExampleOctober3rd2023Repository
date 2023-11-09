package com.sgtesting.methodreturn;
/*
 * 2)Write a method to return count of odd no in b/w 150 to 250
 */
class OddNoCount
{
	int count=0;
	int findCount(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==1)
			{
				count=count+1;
			}
		}
		return count;
	}

}
public class CountOfOddNo {
	public static void main(String[] args) {
		OddNoCount obj=new OddNoCount();
		int c=obj.findCount(150,250);
		System.out.println("Count of odd no:"+c);

	}
}
