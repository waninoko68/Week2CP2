
import java.util.Scanner;

public class W4P1_PosOddRange {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(;;)
        {
            int x = scan.nextInt();
            if(x<=0)
            {
                break;
            }
            if(x%2!=0)
            {
                if(x>max)
                {
                    max = x;
                }
                else if(x<min)
                {
                    min = x;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(max-min);
    }
}
