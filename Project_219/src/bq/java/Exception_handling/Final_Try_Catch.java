package bq.java.Exception_handling;

public class Final_Try_Catch {

	public static void main(String[] args) {
		
		try {
		      int[] myNumbers = {1, 2, 3};   //Arrays
		      System.out.println(myNumbers[5]); 
		      
		   } catch (Exception e) {
		           System.out.println("Something went wrong.");
		           e.printStackTrace();
		           
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }

	}

}
