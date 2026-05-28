package Branching_looping_Statements_Task;

import java.util.Scanner;

public class Task_3
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        if(num<0)
        {
            System.out.println("The Number is Negative Number ");
            return;
        } else if (num==0)
        {
            System.out.println("The Given Number is Neither Postive nor Negative ");
            return;
        }
        else
        {
            System.out.println("The Number is Positive  Number ");
        }
    }
}
