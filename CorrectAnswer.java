
package correct.answer;

import java.util.Scanner;

public class CorrectAnswer {

    public static void main(String[] args) {
    

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer number.");
        int a = input.nextInt();
        int b  = input.nextInt();
        double sum  = (a+b);
        System.out.println("What is you'r answer.");
        int answer = input.nextInt();
        if(answer == sum){
            System.out.println("you'r answer is correct " + sum);
        }else{
            System.out.println("wrong answer.");
        }
    }

}
