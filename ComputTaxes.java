package comput.taxes;

import java.util.Scanner;

public class ComputTaxes {

    public static void main(String[] args) {

        //Financial application: compute taxes
        Scanner input = new Scanner(System.in);
        System.out.print("Enter filing status (0=single,1=married jointly,2=married separately,3=head of household): ");
        int status = input.nextInt();

        System.out.print("Enter taxable income: ");
        double income = input.nextDouble();

        double tax = 0;
        if (income <= 8350) {
            tax = income * 0.10;
        }
        if (income <= 33950);
        tax = 8350 * 0.10 + (income - 8350) * 0.15;
        if (income <= 33950);
        tax = 3350 * 0.15 + (income - 33950) * 0.20;
        if (income <= 44850);
        tax = 33950 * 0.20 + (income - 33950) * 0.25;
        System.out.println("The tax is " + tax);

        //Game: heads or tails
        Scanner input = new Scanner(System.in);

        int coin = (int) (Math.random() * 2);
        System.out.print("Guess heads (0) or tails (1): ");
        int guess = input.nextInt();

        if (guess != 0 && guess != 1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Coin is " + (coin == 0 ? "heads" : "tails"));
            if (guess == coin) {
                System.out.println("You are correct!");
            } else {
                System.out.println("Incorrect guess.");
            }
        }
    }

}
