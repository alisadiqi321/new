
package leapyear.java;
import java.util.Scanner;

public class LeapYearJava {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
          System.out.println("enter a year");
          int year = input.nextInt();
           if (year % 4 == 0 && year % 100!)||(year % 400 == 0){
          System.out.println(" is a leap year" + year);
    
    }
          
          
          
          
    }
    
}
