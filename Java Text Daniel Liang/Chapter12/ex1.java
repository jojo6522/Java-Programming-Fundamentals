/* 
Calculator.java, is a simple command line calculator.
Note that the program terminates if any operand is nonnumeric.
Write a program with an exception handler that deals with nonnumeric operands; then
write another program without using an exception handler to achieve the same objective.
Your program should display a message that informs the user of the wrong operand type before exiting
*/ 

import java.util.*;

public class Calculator{

    public static void main(String[] args)
    {
        

        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers");
            
            int num1= scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("The sum is " + (num1+num2) );

        } catch(InputMismatchException ex){
            System.out.println("Not a valid integer");
        }

        System.out.println("Program does not terminate after given bad input, it states that the input is bad and continues");
    }
} 
