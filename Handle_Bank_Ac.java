package Assignment_Guvi;
import java.util.*;
public class Handle_Bank_Ac {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Deposit Amount : ");
		Double Dep=sc.nextDouble();
		System.out.println("Enter the Withdrawal Amount : ");
		int Withdraw=sc.nextInt();
		Account Ac1 = new Account(Dep,Withdraw);
		Ac1.Check_Balance();
		

	}

}
