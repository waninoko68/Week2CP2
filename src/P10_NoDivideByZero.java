
import java.util.Scanner;

public class P10_NoDivideByZero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        if(z!=0)
        {
            System.out.println(String.format("%.6f", (x+y)/z));
        }
        else
        {
            System.out.println("cannot divide by zero");
        }
    }
}
