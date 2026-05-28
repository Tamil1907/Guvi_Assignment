package Branching_looping_Statements_Task;

import java.util.Scanner;

public class Task_4
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st  Number :");
        int First = sc.nextInt();
        System.out.println("Enter 2nd  Number :");
        int Second = sc.nextInt();
        System.out.println("Enter 3rd  Number :");
        int Third = sc.nextInt();
        if (First<Second && First<Third)
        {
            System.out.println("The Smallest Number is :"+ First);
            return;
        } else if (Second<First && Second<Third)
        {
            System.out.println("The Smallest Number is :"+ Second);
        }
        else
        {
            System.out.println("The Smallest Number is :"+ Third);
        }
    }
}