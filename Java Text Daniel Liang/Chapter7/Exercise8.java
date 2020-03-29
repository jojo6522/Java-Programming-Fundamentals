/*

Write two overloaded methods that return the sum of an array with the following headers:

public static int sum(int[] array)
public static double sum(double[] array)

Write a test program that prompts the user to enter ten doubles values, invokes this method, and displays the sum value.
*/

import java.util.Scanner;

public class Exercise8
{


    public static void main(String[] args)
    {
        double[] arr = new double[10];
        System.out.println("Please enter ten doubles");
        Scanner s = new Scanner(System.in);

        for(int i=0; i<10; i ++)
            arr[i] = s.nextDouble();

        System.out.println("The sum of the numbers is" + sum(arr));
    }

    public static int sum(int[] array)
    {
        int total = 0;

        for(int i=0; i<array.length; i++)
            total = total + array[i];

        return total;

    }

    public static double sum(double[] array)
    {
        double total = 0;

        for(int i=0; i<array.length; i++)
            total = total + array[i];

        return total;

    }
    
