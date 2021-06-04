/*
12.3 (ArrayIndexOutOfBoundsException) Write a program that meets the fol- lowing requirements:
■ Creates an array with 100 randomly chosen integers.
■ Prompts the user to enter the index of the array, then displays the corresponding
    element value. If the specified index is out of bounds, display the message Out of Bounds.
*/


import java.util.*;

public class Array {
    public static void main(String[] args)
    {
        Random   rand = new Random();
        Scanner  scan = new Scanner(System.in);
        boolean isValid= false;


        int[] a = new  int[100];

        for(int i=0; i<a.length; i++)
        {
            a[i] = rand.nextInt();
        }

        System.out.println("Please enter the index for the elemnt you are trying to obtain");
        

        while(!isValid)
        {

        try{

            isValid = true;
            int index= scan.nextInt(); 
            System.out.println("The element is " + a[index]);
            

        } catch(ArrayIndexOutOfBoundsException ex) {
            isValid=false;
            System.out.println("The array index you are trying to access is outside its bounds, Please re-enter a number");

        }

        }

    }
}
