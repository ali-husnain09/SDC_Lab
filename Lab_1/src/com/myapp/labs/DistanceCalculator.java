package com.myapp.labs;

import java.util.Scanner;

public class DistanceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();
        System.out.println("Enter Your Distance in Kilometer");
        int distance = scanner.nextInt();
        int fee = 0;
        if (distance > 20) {
            fee = 7000;

        } else if (distance > 10) {
            fee = 5000;

        } else if (distance > 5) {
            fee = 3500;

        } else {
            fee = 2000;

        }
        System.out.println("Name: " + name + " Distance " + distance + "km" + " Monthly " + fee);

        scanner.close();
    }

}
