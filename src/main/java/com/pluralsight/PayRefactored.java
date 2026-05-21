package com.pluralsight;
import java.util.Scanner;

public class PayRefactored {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("%s has earned $%.2f.", getName(), getPay());
    }
    public static String getName() {
        System.out.print("Enter your name: ");
        return input.nextLine();
    }
    public static double getHours() {
        System.out.print("Enter how many hours worked: ");
        return input.nextDouble();
    }
    public static double getRate() {
        System.out.print("Enter your pay rate: ");
        return input.nextDouble();
    }
    public static double getPay() {
        double pay;
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
