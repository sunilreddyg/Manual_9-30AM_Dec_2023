package bq.java.methods;

public class TVRemote 
{
	
	//Reusable method
	public void turnon()
	{
		System.out.println("Television on");
	}
	
	//Reusable method
	public void turnoff()
	{
		System.out.println("Television OFF");
	}
	
	//Reusable method
	public void nextchannel()
	{
		System.out.println("Channel Changed");
	}

	public static void main(String[] args) 
	{
		new TVRemote().turnon();
		new TVRemote().turnoff();
		new TVRemote().nextchannel();
	}

}
