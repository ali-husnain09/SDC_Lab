package com.myapp.labs;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total_balance = 10000;
        System.out.println("Your Balance is " + total_balance);
        System.out.print("Enter Your Choice : \n 1: Deposit Money\n 2: Withdraw Money");
        int choice = scanner.nextInt();
        double balance;
        switch (choice) {
            case 1:
                System.out.println("Enter Money to Deposit");
                balance = scanner.nextDouble();
                total_balance += balance;
                break;
            case 2:
                System.out.println("Enter money to Withdraw");
                balance = scanner.nextDouble();
                if (balance <= total_balance) {
                    total_balance -= balance;
                } else {
                    System.out.println("You can't Withdraw exceeded money");
                }
                break;
            default:
                System.out.println("Please Enter valid choice");
                break;
        }
        System.out.println("New Balance is: " + total_balance);

        scanner.close();

    }

}
