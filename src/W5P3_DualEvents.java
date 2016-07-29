
import java.util.Scanner;


public class W5P3_DualEvents {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int num1 = 0;
        int num2 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=1; ;++i)
        {
            int n = scan.nextInt();
            if(count1==1&&count2==1)
            {
                break;
            }
            if(x==n&&count1==0)
            {
                num1 = i;
                ++count1;
            }
            if(y==n&&count2==0)
            {
                num2 = i;
                ++count2;
            }
        }
        System.out.println(num1+" "+num2);
    }
}
