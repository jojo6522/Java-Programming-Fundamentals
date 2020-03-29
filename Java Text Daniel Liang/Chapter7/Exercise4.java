/*

Exercise 4
Jordon Johnson

Write a program that reads an unspecified number of scores and determines how many scores are
above or equal to the average and how many scores are below the average. enter a negative number
to signify the end of the input. Assume that the maximum number of scores is 100.
*/

import java.util.Scanner;

public class Exercise4
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int sum=0;
        int count=0;
        int average;
        int above=0;
        int below=0;
        int[] arr = new int[100];
        int num;
        System.out.println("Please enter scores");

        for(int i=0; i<100; i++)
        {
            num = s.nextInt();

            if (num < 0)
                break;

            arr[i] = num;

            count = count + 1;
            sum = sum + arr[i];

        }

        average = sum/count;
        for(int i=0; i<count; i++)
        {
            if(arr[i] > average)
                above = above + 1;
            else
                below = below + 1;

        }


        System.out.println("The average is " + average);
        System.out.println("the total numbers greater than average is " + above);
        System.out.println("the total numbers lesser than average is " + below);

    }

}
