package decimalformate;
import java.text.DecimalFormat;
public class Decimalformate {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.####E00");
        String str =decimalFormat.format(123456);//1234
        System.out.println(str);
        
        
        
        
        
        
    }

}
