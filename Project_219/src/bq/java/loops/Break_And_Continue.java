package bq.java.loops;

import java.util.Scanner;

public class Break_And_Continue 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number between 1 to 10:-->");
		int num=sc.nextInt();
		
		
		//Break:-->  Jump Command
		for (int i = 1; i <= 10; i++) 
		{
			if(i==num)
			{
				break; //It is a jump condition it break iteration and bring controls out of looping
			}
			System.out.println(i);
		}
		
		
		//Continue
		for (int i = 1; i <= 10; i++) 
		{
			if(i==num)
			{
				continue; //It is a jump condition it only break one iteration
			}
			System.out.println(i);
		}
		

	}

}
