package futuertuition.java;

public class FutuerTuitionJava {

    public static void main(String[] args) {
     double tuition = 10000;
        int year = 0;
        while (tuition < 20000) {
          tuition = tuition * 1.07;
          year++;
        }
        System.out.println("tuition will be doubled is"+ year +"year");
        System.out.println("tuition:"+tuition);
        
    }

}
