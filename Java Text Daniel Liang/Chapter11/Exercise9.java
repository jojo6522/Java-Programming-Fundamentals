import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise9 {

    public static void main(String[] args)
    {
        Scanner p = new Scanner(System.in);
        int[][] arr;
        int size;
        int count = 0;
        int maxrow = 0;
        int maxcol = 0;
        Random rand = new Random();
        ArrayList<Integer> listrow = new ArrayList<Integer>();
        ArrayList<Integer> listcolumn = new ArrayList<Integer>();


        System.out.println("Please enter the size of your array");
        size=p.nextInt();
        arr = new int[size][size];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]= rand.nextInt(2);
            }
        }

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }

        for(int i=0;i<size;i++)
        {
        for(int j=0;j<size;j++)
        {
            if(arr[i][j]==0)
            {
                count = count + 1;
            }
        }
        listrow.add(count);
        }


        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(arr[j][i]==0)
                {
                    count = count + 1;
                }
            }
            listcolumn.add(count);
        }

        maxrow = Collections.max(listrow);
        maxcol = Collections.max(listcolumn);

        System.out.println("The rows with the most number of 0's can be found at index " + listrow.indexOf(maxrow));
        System.out.println("The columns with the most number of 0's can be found at index " + listrow.indexOf(maxcol));


    }
