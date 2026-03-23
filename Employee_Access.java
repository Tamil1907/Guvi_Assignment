package Assignment_Guvi;
import java.util.*;
public class Employee_Access {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name=sc.next();
		System.out.println("Enter the Age : " );
		int age=sc.nextInt();
		System.out.println("Enter the Emp_ID : " );
		long emp=sc.nextLong();
		System.out.println("Enter the Salary : " );
		double salary=sc.nextDouble();
		Employee E1 = new Employee(name,age,emp,salary);//--->parsing the value to employee class
		E1.Display_Details();//---> Display the emp details
		
		
		
	}

}
