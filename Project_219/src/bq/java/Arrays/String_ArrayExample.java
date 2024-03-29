package bq.java.Arrays;

public class String_ArrayExample 
{

	public static void main(String[] args) 
	{
		
		String str="ABCDEFGH";
		char ch[]=str.toCharArray();
		System.out.println(ch[4]);
		
		//splict space as delimeter
		String browsers="chrome firefox";
		String browser[]=browsers.split(" ");
		System.out.println(browser[0]+"  "+browser[1]);
		
		//Split cama delimeter
		String chars="A,B,C,D";
		String sch[]=chars.split(",");
		System.out.println(sch[0]+" "+sch[3]);
		
	}

}
