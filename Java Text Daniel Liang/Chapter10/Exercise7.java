import javax.security.auth.login.AccountException;
import java.util.*;
public class Account2 {


    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account2(){
        id = 0;
        balance = 0;
        dateCreated = new java.util.Date();
    }

    public Account2( int i, double b){
        id = i;
        balance = b;
        dateCreated = new java.util.Date();
    }


    public Account2(int input_id, double input_balance, double input_air)
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

    public static boolean isValid(int id, Account2[] accounts)
    {
       for (int j=0; j<accounts.length ;j++)
       {
           if( id == accounts[j].getId())
           {
               return true;
           }
       }

       return false;
    }

    public static int menu()
    {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. exit");
        int c = b.nextInt();
        return c;

    }

    public static void execute(int choice, int id, Account2[] accounts)
    {
        Scanner b = new Scanner(System.in);
        if (choice == 1)
        {
            System.out.println("The balance is " + accounts[id].getBalance() );
        }

        if (choice ==2)
        {
            System.out.println("Please enter the amount you would like to withdraw");
            double amt = b.nextDouble();
            accounts[id].withdraw(amt);

        }

        if (choice ==3)
        {
            System.out.println("Please enter the amount you would like to deposit");
            double amt = b.nextDouble();
            accounts[id].deposit(amt);

        }


    }


    public static void main(String[] args)
    {

        Account2[] accounts = new Account2[10];
        Scanner p = new Scanner(System.in);
        int id;
        int choice;


        for(int j=0; j<accounts.length;j++)
        {
            accounts[j] = new Account2(j, 100);
        }

        do {

            System.out.println("Please enter id within the specified range (0-9)");
            id = p.nextInt();


            if (isValid(id, accounts)) {
                do {
                    choice = menu();
                    execute(choice, id, accounts);
                } while (choice != 4);
            }
        }while(true);




    }
}
