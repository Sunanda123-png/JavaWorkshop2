package com.bridgelabz;

import java.util.Scanner;

public class Banking {
    Scanner scanner;
    public Banking()
    {
        scanner =new Scanner(System.in);
    }
    public int getInt()
    {
        return scanner.nextInt();
    }
    public String getString()
    {
        return scanner.nextLine();
    }
    public float getFloat()
    {
        return  scanner.nextFloat();
    }

    /**
     * for adding the money in your account
     * @param amount
     * @return
     */
    public int credit(int amount)
    {
        System.out.println("Enter the Credit amount:-");
        int creditamount=getInt();
        amount=amount+creditamount;
        return  amount;
    }

    /**
     * for rate of interest
     * @param amount
     * @return
     */

    public int interestRate(int amount)
    {
        System.out.println("Enter the rate of interest:-");
        int rate=getInt();
        amount=amount+(rate*amount*12)/100;
        return amount;
    }

    /**
     * For chossing the options this method has been created
     * @param name
     * @param account_No
     * @param amount
     * @return
     */
    public int creditOrRate(String name, int account_No, int amount) {
        System.out.println("Enter your Choice:- 1.Credit 2.TotalValue after 12 month ");
        int Choice = getInt();
        if (Choice == 1)
        {
            amount = credit((int) amount);
        } else if (Choice == 2)
        {
            amount = interestRate(amount);
        }
        return (int) amount;
    }
    public void printDetails(String name, int accountnumber, int amount)
    {
        System.out.println("Account Holder Name:-"+name+"Account number:-"+accountnumber);
        System.out.println("Your Bal is:-" + amount);
    }
}
class Main
{
    /**
     * Executing all method from main
     * @param args
     */
    public static void main(String[] args)
    {
        int accountnumber;
        String name;
        int amount;

        Banking audit=new Banking();
        System.out.println("Enter Name:- ");
        name= audit.getString();
        System.out.println("Enter Account Number:- ");
        accountnumber = audit.getInt();
        System.out.println("Enter the Credit amount:- ");
        amount = audit.getInt();
        while (true)
        {
            int BasicAmount=audit.creditOrRate(name,accountnumber,amount);
            System.out.println("Enter your Choice : 1.Repeat 2.Print details");
            int option= audit.getInt();
            if (option==2)
            {
                audit.printDetails(name,accountnumber,BasicAmount);
            }
        }
    }
}
