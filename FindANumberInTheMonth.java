package find.a.number.in.the.month;

import java.util.Scanner;

public class FindANumberInTheMonth {

    public static void main(String[] args) {

        //Find the number of days in a month
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Palindrome integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number:");
        int number = input.nextInt();
        int handred = number / 100;
        int tens = (number / 100) % 10;
        int unit = number % 10;
        if (handred == unit) {
            System.out.println("The number is pollindrom");
        } else {
            System.out.println("The numbr is not pollindrom ");
        }

    }

}
