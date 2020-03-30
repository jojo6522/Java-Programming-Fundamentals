/*
Write a program that sums and displays each row in the follow 2D array
  int[][] matrix = {
                {1,2,3},
                {1,1,1},
                {6,6,6},
        };
.
*/

import java.util.Scanner;

public class PQ1 {


    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {1,1,1},
                {6,6,6},
        };

        int[] sum = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            sum[row] = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum[row] = sum[row] + matrix[row][column];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("The sum of row " + (i + 1) + " is " + sum[i]);
        }

    }
}
