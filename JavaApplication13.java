
package javaapplication13;
import java.util.Scanner;
public class JavaApplication13 {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("enter radius");
   double radius = input.nextDouble();
  double area = radius * radius * 3.1415;   

   
   System.out.println("the area for the of circle of radius ="+radius+"is" + area );
   
    }
    
}
