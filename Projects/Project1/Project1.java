/**************************************************************************************************************************
Name: Jordon Johnson
                                                     Project Description
                              Sorting an Array of Clocks/ Displaying in a GUI/Creating a Class
Create a class called Clock to represent a Clock. It should have three private instance variables: 
An int for the hours, an int for the minutes, and an int for the seconds. 
The class should include a three- argument constructor and get and set methods for each instance variable. 
Override the method toString which should return the Clock information in the same format as the input file (See below).
Read the information about a Clock from a file that will be given to you on Blackboard, 
parse out the three pieces of information for the Clock using a StringTokenizer, 
instantiate the Clock and store the Clock object in two different arrays (one of these arrays will be sorted in a later step). 
Once the file has been read and the arrays have been filled, sort one of the arrays by hours using Selection Sort.
Display the contents of the arrays in a GUI that has a GridLayout with one row and two columns. 
The left column should display the Clocks in the order read from the file, 
and the right column should display the Clocks in sorted order.
The input file
Each line of the input file will contain information about a Clock, with each piece of information separated by a colon. 
An example of the input file would be:
12:31:19
17:23:19
If the line of the file does not have exactly three tokens, do not put it in the arrays; print it to the console.
Submitting the Project.
You should have three files to submit for this project:
Project1.java
ClockGUI.java
Clock.java
Upload your project to Blackboard by the due date for full credit. Proper Javadoc is expected for the Clock class.
************************************************************************************************************************/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project1 {

    public static void main(String[] args) {
        File file = new File("/Users/jordonjohnson/Downloads/clock.txt");
        int clockCounter = 0;
        Clock[] clockUnsorted = new Clock[100];
        Clock[] clockSorted = new Clock[100];

        try {
            Scanner scanner = new Scanner(file);

            //reading each line from the file
            while (scanner.hasNextLine()) {
                //scanning the line and storing into a variable line
                String line = scanner.nextLine();
                //breaking up the object into tokens
                StringTokenizer clocktokens = new StringTokenizer(line, ":");
                //storing the tokenss into object Clock
                if(clocktokens.countTokens()<3) {
                    System.out.println("Invalid format " + line);

                }else {
                    Clock clock = new Clock(Integer.parseInt(clocktokens.nextToken()), Integer.parseInt(clocktokens.nextToken()), Integer.parseInt(clocktokens.nextToken()));
                    //storing the clock in an array
                    clockUnsorted[clockCounter] = clock;
                    clockSorted[clockCounter] = clock;
                    // incrementing the clockCounter
                    clockCounter++;
                }

            }// closes while
            scanner.close();

            // invokes method to sort array
            sortClock(clockSorted, clockCounter);

            ClockGUI clockGUI=new ClockGUI();

            //Invoking ClockGUI class showBothClocksInGridLayout method to display in Grid Layout
            clockGUI.showBothClocksInGridLayout(clockUnsorted, clockSorted, clockCounter);


            /*for(int i=0; i<clockCounter; i++)
            {
                System.out.println(clockSorted[i]);
            } */


        } catch(FileNotFoundException e)
        {
            System.out.println("Error");// closes try
        }


    } // closes main

    private static void sortClock(Clock[] clockSorted, int clockCounter) {

        //Iterate the loop till clockCounter-1 values
        for (int i = 0; i < clockCounter-1; i++) {

            //Initialize the smallest index as first element index
            int smallestIndex = i;

            for (int j = i+1; j < clockCounter; j++) {
                if (clockSorted[j].getHours() < clockSorted[smallestIndex].getHours()) {
                    smallestIndex = j;
                }
                else if(clockSorted[j].getHours() == clockSorted[smallestIndex].getHours()){
                    if(clockSorted[j].getMinutes()<clockSorted[smallestIndex].getMinutes()){
                        smallestIndex=j;
                    }
                    else if(clockSorted[j].getMinutes()==clockSorted[smallestIndex].getMinutes()){
                        if(clockSorted[j].getSeconds()<clockSorted[smallestIndex].getSeconds())
                            smallestIndex=j;
                    }
                }
            }
            //Swap the element at minimum index to the first element
            Clock tempClock = clockSorted[smallestIndex];
            clockSorted[smallestIndex] = clockSorted[i];
            clockSorted[i] = tempClock;
        }
    }
}
