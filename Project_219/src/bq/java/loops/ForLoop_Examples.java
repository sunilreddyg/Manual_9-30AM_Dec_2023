package bq.java.loops;

import java.util.Scanner;

public class ForLoop_Examples {

	public static void main(String[] args) 
	{
		
		//print numbers 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		//print numbers 20 to 10
		for (int i = 20; i >=10; i--) 
		{
			System.out.println(i);
		}
		
		
		//How to Read data from system..
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter start number");
		int start=sc.nextInt();
		
		System.out.println("enter end number");
		int end=sc.nextInt();
		
		for (int i = start; i <= end; i++) 
		{
			System.out.println(i);
		}
		
	}

}
