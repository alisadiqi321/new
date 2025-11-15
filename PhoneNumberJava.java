package phonenumber.java;
import java.util.Scanner;
public class PhoneNumberJava {
    public static void main(String[] args) {
         System.out.println("enter a numberphone :");
        Scanner input = new Scanner(System.in);
        int numberphone = input.nextInt();
        switch (numberphone) {
            case 70:
                System.out.println("AWCC"); break;
            case 71:
                System.out.println("AWCC"); break;
            case 72:
                System.out.println("Roshan"); break;
            case 73:
                System.out.println("Etisalat"); break;
            case 74:
                System.out.println("Salam"); break;
            case 76:
                System.out.println("Atoma"); break;
            case 77:
                System.out.println("Atoma"); break;
            case 78:
                System.out.println("Etisalat"); break;
            case 79:
                System.out.println("Roshan"); break;
            default:
               System.out.println("Invalid company namber");
               
        }

    }

}
