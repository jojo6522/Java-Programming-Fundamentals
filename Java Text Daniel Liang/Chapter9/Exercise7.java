/*

Jordon Johnson
04/07/20

    Design a class named Account that contains:
     A private int data field named id for the account (default 0).
     A private double data field named balance for the account (default 0).
     A private double data field named annualInterestRate that stores the current
     interest rate (default 0). Assume all accounts have the same interest rate.
     A private Date data field named dateCreated that stores the date when the
     account was created.
     A no-arg constructor that creates a default account.
     A constructor that creates an account with the specified id and initial balance.
     The accessor and mutator methods for id, balance, and annualInterestRate.
     The accessor method for dateCreated.
     A method named getMonthlyInterestRate() that returns the monthly
     interest rate.
     A method named getMonthlyInterest() that returns the monthly interest.
     A method named withdraw that withdraws a specified amount from the
     account.
     A method named deposit that deposits a specified amount to the account.
    Write a test program that creates an Account object with an account ID of 1122,
    a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
    method to withdraw $2,500, use the deposit method to deposit $3,000, and print
    the balance, the monthly interest, and the date when this account was created
*/

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account(){
        id = 0;
        balance = 0;
        dateCreated = new java.util.Date();
    }


    public Account(int input_id, double input_balance, double input_air)
    {
        id = input_id;
        balance = input_balance;
        annualInterestRate = input_air;
        dateCreated = new java.util.Date();
    }

    public String getDate()
    {
        return dateCreated.toString();
    }

    public int getId()
    {
        return id;
    }

    public  double getBalance()
    {
        return balance;
    }

    public double getAIR()
    {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public static void main (String[] args)
    {
        Account a1 = new Account(1122, 20000,4.5);
        a1.withdraw(2500);
        a1.deposit(3000);

        System.out.println("The balance is " + a1.getBalance());
        System.out.println("The monthly interest is " + a1.getMonthlyInterestRate());
        System.out.println(" As at " + a1.getDate());

    }
}
