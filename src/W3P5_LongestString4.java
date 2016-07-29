
import java.util.Scanner;

public class W3P5_LongestString4 {
        public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = " ";
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
                max=a;
                longestStr = x;
            }
        }
        System.out.println(longestStr);
    }
}
