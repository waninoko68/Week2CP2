
import java.util.Scanner;

public class W3P4_LongestString3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = " ";
        for(int i=0;i<5;++i)
        {
            String x = scan.nextLine();
            int a = x.length();
            if(a>=max)
            {
                max=a;
                longestStr = x;
            }
        }
        System.out.println(longestStr);
    }
}
