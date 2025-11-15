
package computingtaxeah.w;
import java.util.Scanner;
public class ComputingtaxeahW {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String Status ;
       double salary;
       System.out.println("enter your status");
       Status = input.nextLine();
       System.out.println("enter your salary");
       salary = input.nextDouble();
       double x = salary*10/100;
       double y = salary*15/100;
       double z = salary*25/100;
       double a = salary*28/100;  
       double b = salary*33/100;
       double c = salary*35/100;
       if("single".equals(Status) && salary>0 && salary<=8350){
         System.out.println("your tax is" + x);  
       }
       else if("Married Filing jointly".equals(Status) && salary>0 && salary<=16700){
       System.out.println("your tax is" + x);
       }
       else if("Married Filing jointly".equals(Status) && salary>0 && salary<=8350){
       System.out.println("your tax is" + x);
       }
       else if("Head of Household".equals(Status) && salary>0 && salary<=11950){
       System.out.println("your tax is" + x);     
       }      
else if("Single".equals(Status) && salary>0 && salary<=33950){
       System.out.println("your tax is" + y);
} 
       else if("Married Filing jointly".equals(Status) && salary>0 && salary<=67900){
       System.out.println("your tax is" + y);
       }
       else if("Head of Household".equals(Status) && salary>0 && salary<=45500){
       System.out.println("your tax is" + y);
       }
      else if("Single".equals(Status) && salary>0 && salary<=82250){
       System.out.println("your tax is" + z); 
      }
      else if("Married Filing jointly".equals(Status) && salary>0 && salary<=137050){
       System.out.println("your tax is" + z);
       }
         else if("Head of Household".equals(Status) && salary>0 && salary<=68525){
       System.out.println("your tax is" + z);
       }
       else if("Single".equals(Status) && salary>0 && salary<=171550){
       System.out.println("your tax is" + a); 
      }
      else if("Married Filing jointly".equals(Status) && salary>0 && salary<=208850){
       System.out.println("your tax is" + a);
       } 
          else if("Head of Household".equals(Status) && salary>0 && salary<=104425){
       System.out.println("your tax is" + a);
       }
       
        else if("Single".equals(Status) && salary>0 && salary<=190200){
       System.out.println("your tax is" + b); 
      }
       else if("Married Filing jointly".equals(Status) && salary>0 && salary<=203250){
       System.out.println("your tax is" + b);
       }  
           else if("Head of Household".equals(Status) && salary>01234 && salary<=104425){
       System.out.println("your tax is" + b);
       }
       
            else if("Single".equals(Status) && salary>3245623 && salary<=1902003){
       System.out.println("your tax is" + c); 
      }
       else if("Married Filing jointly".equals(Status) && salary>123456 && salary<=2032503){
       System.out.println("your tax is" + c);
       }  
           else if("Head of Household".equals(Status) && salary>17000 && salary<=1044251){
       System.out.println("your tax is" + c);
       }
           else System.out.println("invaild salary or gender!");
  
    }
   
}
