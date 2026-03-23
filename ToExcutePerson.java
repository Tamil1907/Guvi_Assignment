package Assignment_Guvi;

public class ToExcutePerson {

	public static void main(String[] args) 
	{
		// Creating the Object for Person Class
		Person P1=new Person();//-----> Calling the Default constarctor
		Person P2=new Person("Tamil",18);//---->Calling the Parameterized constarctor
		P1.Display();//--->Calling Default constarctor Output Function
		P2.Display();//--->Calling Parameterized constarctor Output Function
		
	}

}
