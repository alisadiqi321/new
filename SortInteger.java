package sort.integer;

import java.util.Scanner;

public class SortInteger {

    public static void main(String[] args) {

        //Sort three integers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b && b > c) {
            System.out.println("Sort is " + a + "   " + b + "   " + c);
        }
        if (a > c && c > b) {
            System.out.println("Sort is " + a + "   " + c + "   " + b);
        }
        if (b > a && a > c) {
            System.out.println("Sort is " + b + "   " + a + "   " + c);
        }
        if (b > c && c > a) {
            System.out.println("Sort is " + b + "   " + c + "   " + a);
        }
        if (c > a && a > b) {
            System.out.println("Sort is " + c + "   " + a + "   " + b);
        }
        if (c > b && b > a) {
            System.out.println("Sort is " + c + "   " + b + "   " + a);
        }

        if (c == b && b == a) {
            System.out.println("The three nubmber are equeal.");
        }

    }

}
