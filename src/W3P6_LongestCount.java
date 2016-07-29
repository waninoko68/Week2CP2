
import java.util.Scanner;

public class W3P6_LongestCount {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count=0;
        for(;;)
        {
            String x = scan.nextLine();
            int a = x.length();
            if(a==0)
            {
                break;
            }
            if(a>=max)
            {
                if(a>max)
                {
                    count=0;
                    max=a;
                }
                if(a==max)
                {
                    ++count;
                }
            }
        }
        System.out.println(max);
        System.out.println(count);
    } 
}
