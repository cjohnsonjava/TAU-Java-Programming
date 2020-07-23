package chapter3;

import java.util.Scanner;

/*
 * Chapter 3 Independent Exercise: Change for a Dollar Game
 * This program asks the user
 * to enter the quantities for the following coins:
 * pennies, nickels, dimes and quarters
 * Then the program will count up the value of all of the change that they answered.
 * If it's exactly one dollar then they win the game.
 * If it's more than one dollar, tells them that it's more than one dollar and how much they went over.
 * If it's less than one dollar, tells them how much they went under.
 */
public class ChangeForDollarGame {
    public static void main(String args[]) {

        //What we know - how much each coin is worth
        double valuePenny = .01;
        double valueNickel = .05;
        double valueDime = .10;
        double valueQuarter = .25;
        double oneDollar = 1.00;

        //Asks the user to enter the quantities for the coins.
        System.out.print("How many pennies?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.print("How many nickels?");
        int nickels = scanner.nextInt();

        System.out.print("How many dimes?");
        int dimes = scanner.nextInt();

        System.out.print("How many quarter?");
        int quarters = scanner.nextInt();
        scanner.close();

        //How to calculate - count up the value of all of the change that they answered.
        double totalChange = pennies * valuePenny + nickels * valueNickel + dimes * valueDime + quarters * valueQuarter;
        if (totalChange == oneDollar) {
            System.out.println("You win the game. The total change is $" + String.format("%.2f",totalChange));
        } else if (totalChange > oneDollar) {
            double overChangeAmount = totalChange - oneDollar;
            System.out.println("You lose. Your change went over by $" + String.format("%.2f", overChangeAmount));
        } else if (totalChange < oneDollar) {
            double shortOnChange = oneDollar - totalChange;
            System.out.println("You lose. You are short by $" + String.format("%.2f", shortOnChange));
        }
    }

}


