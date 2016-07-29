
import java.util.Scanner;


public class W5P1_FirstTimeRecord {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int num = 0;
        for(int i=1; ;++i)
        {
            int x = scan.nextInt();
            if(x==0)
            {
                break;
            }
            if(x==n&&count==0)
            {
                num = i;
                ++count;
            }
        }
        if(count==0)
        {
            System.out.println("target not found");
        }
        else
        {
            System.out.println(num); 
        }
        
    }
}
