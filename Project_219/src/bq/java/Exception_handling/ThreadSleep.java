package bq.java.Exception_handling;

public class ThreadSleep {

	public static void main(String[] args) 
	{
		
		
		System.out.println("Statement1");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Statement2");

	}

}
