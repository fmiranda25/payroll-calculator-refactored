package com.pluralsight;
import java.util.Scanner;

public class PayRefactored {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s has earned $%.2f.", getName(), getPay());
    }
    public static String getName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        return name;
    }
    public static double getHours() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many hours worked: ");
        double hours = input.nextDouble();
        return hours;
    }
    public static double getRate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your pay rate: ");
        double rate = input.nextDouble();
        return rate;
    }
    public static double getPay() {
        double pay = 0;
        double hours = getHours();
        double rate = getRate();
        if (hours > 40) {
            pay = (((hours - 40) * rate) * 1.5f) + (rate * 40);
        } else {
            pay = hours * rate;
        }
        return pay;
    }
}
