package com.sgtesting.StringDemo;

class TestDemo
{
	String s=new String("Divya");
	void findLength() {
	int res= s.length();
	System.out.println(res);
	}
    void findCharIndex()
    {
    	char res=s.charAt(2);
    	System.out.println(res);	
    }
    void findCodePointAt()
    {
    	int res=s.codePointAt(2);
    	System.out.println(res);
    }
    void findSubString()
    {
    	String res=s.substring(2);
    	System.out.println(res);
    }
    void findSubstringStartend()
    {
    	String res =s.substring(2, 4);
    	System.out.println(res);
    }
    void replaceChar() {
    	String res =s.replace("v", "ee");
    	System.out.println(res);
    }
    void exisitngOfString()
    {}
   
   
}
public class StringDemoTest {
	public static void main(String[] args) {
		TestDemo obj=new TestDemo();
		obj.findLength();
		obj.findCharIndex();
		obj.findCodePointAt();
		obj.findSubstringStartend();
		obj.replaceChar();
	

}
}