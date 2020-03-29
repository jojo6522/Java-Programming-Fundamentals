/*

Excercise 5
Jordon Johnson
03/29/2020

Write a program that reads ten integers, and then displays the number of even and odd numbers. 
*/

import java.util.Scanner;

public class Exercise5
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int evencount=0;
        int oddcount=0;

        int[] arr = new int[10];

        System.out.println("Please enter ten numbers");

        for(int i=0; i<10; i++)
        {
            arr[i] = s.nextInt();
            if (arr[i]%2 == 0)
                evencount = evencount + 1;
            else
                oddcount = oddcount + 1;

        }


        System.out.println("total even numbers " + evencount);
        System.out.println("total odd numbers " + oddcount);
        
    }

}
