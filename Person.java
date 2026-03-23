package Assignment_Guvi;

public class Person 
{
	String Name;
	int Age;
	
	// Create the Default Constructor
	public Person() 
	{
		Age=18;
		Name="Prakash";
	
		
	}
			
		// Create the Parametraized Constructor
		public Person(String Name,int Age) 
		{
			this.Name=Name;
			this.Age=Age;
		}
		public void Display()
		{
			System.out.println("Name:" + Name + " Age: " + Age);
			System.out.println();
		}
	}

	

