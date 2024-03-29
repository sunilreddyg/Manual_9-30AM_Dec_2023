package bq.java.Arrays;

public class Double_Dimensional_StaticArray 
{

	public static void main(String[] args) 
	{
		
		
		//Declaration of double dimensional array
		String data[][]=new String[3][2];
		
		//Storing first row data 
		data[0][0]="OnePlus";
		data[0][1]="35000.00";
		
		//Storing Second row data 
		data[1][0]="Samsung";
		data[1][1]="65000.00";
	
		//Storing third row data 
		data[2][0]="Iphone";
		data[2][1]="55000.00";
		
		System.out.println(data[1][0]+"   "+data[1][1]);
		
		//Get Number of Rows Data Presente at array
		int len=data.length;
		System.out.println(len);
		//Note:--> We can't get coloumn size..
		
		
	}

}
