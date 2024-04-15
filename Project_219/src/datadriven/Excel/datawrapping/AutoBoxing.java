package datadriven.Excel.datawrapping;

public class AutoBoxing {

	public static void main(String[] args) {
		
		
		/*
		 * AutoBoxing:-->
		 * 	The automatic conversion of primitive 
		 * data type into its corresponding wrapper 
		 * class is known as autoboxing 
		 */
		
		//Primitive value
		int a=20;  
		
		//AutoBoxing value
		Integer num=new Integer(a);
		
		//Convertin integer value to numeric
		String str=num.toString();
		System.out.println(str.equals("20"));
		
		//Converting integer value to double
		double dble=num.doubleValue();
		System.out.println(dble==20.0);
		
		
	}

}
