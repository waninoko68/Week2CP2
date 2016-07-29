
import java.util.Scanner;

public class P14_HowToBreak {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x<40)
        {
            System.out.println("Fail");
        }
        if(x>=40&&x<80)
        {
            System.out.println("Pass");
        }
        if(x>=80)
        {
            System.out.println("Excellent");
        }
    }
    
}
