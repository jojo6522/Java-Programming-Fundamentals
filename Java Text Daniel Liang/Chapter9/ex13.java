/* 
9.13 (The Location class)
Design a class named Location for locating a maximal value and its
location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its
indices in a two-dimensional array with row and column as int types and maxValue as a double type.
Write the following method that returns the location of the largest
element in a two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location.
Write a test program that prompts the user to enter a two-dimensional
array and displays the location of the largest element in the array.


*/

import java.util.*;
public class Location{

    public int row,column;
    public double maxValue;

    public Location(int row, int column, double maxValue)
    {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    
    public static Location locateLargest(double[][] a)
    {
        int row = 0;
        int column = 0;
        double maxValue = a[row][column];

        for(int i=0;i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                if (maxValue < a[i][j]) { 
                    maxValue = a[i][j];
                    column = i;
                    row = j;

                }

            }
        }
        return new Location(row, column, maxValue); 
    }

    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array");
        int row = input.nextInt();
        int column = input.nextInt();

        double m[][] = new double[row][column];

        System.out.println("Enter the array");

        for(int i=0;i<m.length; i++)
        {
            for(int j=0; j<m[i].length; j++)
            {
                m[i][j] = input.nextDouble();
            }
        }

        // The below returns the object Location of the largest location
        Location location = Location.locateLargest(m);

        System.out.println("The largest element is " + location.maxValue + " at " + location.column + "," +location.row);
    
    }
}
