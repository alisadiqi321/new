package cost.of.shopping;
import java.util.Scanner;
public class CostOfShopping {

    public static void main(String[] args) {
//Cost of shipping
Scanner input = new Scanner(System.in);
  
        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        if (weight <= 0) {
            System.out.println("Invalid input.");
        } else if (weight <= 1) {
            System.out.println("Shipping cost is $3.5");
        } else if (weight <= 3) {
            System.out.println("Shipping cost is $5.5");
        } else if (weight <= 10) {
            System.out.println("Shipping cost is $8.5");
        } else if (weight <= 20) {
            System.out.println("Shipping cost is $10.5");
        } else {
            System.out.println("The package cannot be shipped.");}
    }
}
    


