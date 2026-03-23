package Assignment_Guvi;

public class Employee extends person_1
{
	long Emp_Id;
	double salary;

	public Employee(String Name, int Age,long Emp_Id,double salary)//take input from main class
	{
		super(Name, Age);//--->call person1 class contractor to access the variable
		this.Emp_Id=Emp_Id;
		this.salary=salary;
		
	}
   public void Display_Details() //----> to view emp details
	{
		System.out.println("Name : " + Name);
		System.out.println("Age : " + Age);
		System.out.println("Emp_ID : " + Emp_Id);
		System.out.println("Salary : " + salary);
	}
	

}
