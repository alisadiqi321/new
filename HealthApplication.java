package health.application;

import java.util.Scanner;

public class HealthApplication {

    public static void main(String[] args) {
        //Health application 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height in meter:");
        double height = input.nextDouble();
        System.out.println("Enter the wight in killogram:");
        double weight = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("Your BMI is " + BMI);
        if (BMI < 17.5) {
            System.out.println("you are under wigth.");
        }
        if (BMI > 17.5 && BMI < 23.5) {
            System.out.println("you are normal");
        }
        if (BMI > 23.5) {
            System.out.println("you are over wigth");
        }
    }

}
