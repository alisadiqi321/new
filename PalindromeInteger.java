package palindrome.integer;

import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {
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
