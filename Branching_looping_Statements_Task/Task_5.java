package Branching_looping_Statements_Task;
import java.util.Scanner;
public class Task_5
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Total Purchase Amount is :");
        double purchase_Amt = sc.nextInt();
        double Dis = 0.0;
        double Final_Amt=0.0;
        if(purchase_Amt>=500 && purchase_Amt<=1000 )
        {
            Dis=purchase_Amt*.10;
            Final_Amt=purchase_Amt-Dis;
            System.out.println("Woow you got 10% dis applied the Final amount is :"+Final_Amt);
            return;
        } else if (purchase_Amt>1000)
        {
            Dis=purchase_Amt*.20;
            Final_Amt=purchase_Amt-Dis;
            System.out.println("Woow you got 20% dis applied the Final amount is :"+Final_Amt);
            return;
        }
        else
        {
            System.out.println("The Final Payable amount is :"+purchase_Amt);
        }

    }
}
