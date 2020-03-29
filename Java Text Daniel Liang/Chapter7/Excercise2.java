/*

Excercise 2
Jordon Johnson
03/29/2020
The program reads fifteen numbers and displays them in the reverse order they were read.


*/
import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int[] arr = new int[15];
        System.out.println("Please enter the 15 numbers to be reversed");

        for(int i=0;i<15;i++)
            arr[i] = s.nextInt();


        for(int i=arr.length-1; i>=0; i--)
        System.out.print(" " + arr[i] );
    }
}
    
 
