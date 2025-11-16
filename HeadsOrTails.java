package heads.or.tails;

import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
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
