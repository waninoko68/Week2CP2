
import java.util.Scanner;

public class W2P14_HowToBreak {
    public static void main(String[] args)
    {
        int count=0;
        Scanner scan = new Scanner(System.in);
        for(;;)
        {
            int x = scan.nextInt();
            if(x==0)
            {
                break;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
