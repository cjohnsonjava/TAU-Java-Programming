/**
 * A program that asks a user for a season of the year, then a whole number, then an adjective.
 * It uses the input to complete the sentence below and output the result.
 */

package chapter2;

import java.util.Scanner;

public class CompleteTheSentence {

    public static void main(String args[]){
        //1. Asks the user for a season of the year
        System.out.println("Enter the season of the year");
        Scanner scanner = new Scanner(System.in);//created an object to scan in information.
        String season = scanner.next();

        //2. Then a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //3. Then an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        //4. Use the input to complete the sentence below
        //"On a [adjective] [season of the year] day, I drink a
        //minimum of [whole number] cups of coffee."
        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");


    }
}
