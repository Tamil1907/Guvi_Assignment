package Assignment_Guvi;

public class Account 
{
	double balance;
	public Account()
	{
		balance=0;
	}
	public Account(double Deposit,int withdraw)
	{
		if(Deposit>0)
		{
		this.balance=balance+Deposit;
		}
		else
		{
			System.out.println("Pls Enter Correct Deposit Amount");
		}
		if(balance>0 && balance>=withdraw)
		{
			this.balance=balance-withdraw;
		}
		else
		{
			System.out.println("Insufficient Fund");
		}
	}
	public void Check_Balance()
	{
		System.out.println("Youre Balance is :"+balance);
	}
	

}
