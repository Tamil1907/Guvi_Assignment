package Branching_looping_Statements_Task;

import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            // I am taking the input from user
            System.out.println("Enter the number which number you want reverse : ");
            //Storing the input from the container
            int num=sc.nextInt();
            // I am assign one container to store the reverse number
            int Reverse_No=0;
            // Then we have pass the input to run the loop until condition false
            while(num>0)
            {
                // Then i am storing the last value to Reverse container
                Reverse_No=(num%10)+(Reverse_No*10);
                //Then i am removing the last value
                num=num/10;
            }
            System.out.println("The given reverse number is : "+Reverse_No);



        }
}
