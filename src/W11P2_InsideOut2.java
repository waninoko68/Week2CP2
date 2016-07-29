
import java.util.Scanner;


public class W11P2_InsideOut2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int x = str.length()-1;
        int y = 0;
        System.out.print(str.charAt(n));
        if(str.length()%2!=0)
        {            
            for(int i=1;i<=str.length()/2;++i)
            {
                int left = n-i;
                if(left<0)
                {
                    System.out.print(str.charAt(x));
                    --x;
                }
                else
                {
                    System.out.print(str.charAt(left)); 
                }                
                int right = n+i;
                if(right>str.length()-1)
                {
                    System.out.print(str.charAt(y));
                    ++y;
                }
                else
                {
                    System.out.print(str.charAt(right)); 
                }
            }
        }
        else
        {
            for(int i=1;i<=str.length()/2;++i)
            {
                int right = n+i;
                if(right>str.length()-1)
                {
                    System.out.print(str.charAt(y));
                    ++y;
                }
                else
                {
                    System.out.print(str.charAt(right)); 
                }
                if(i==str.length()/2)
                {
                    break;
                }
                int left = n-i;             
                if(left<0)
                {
                    System.out.print(str.charAt(x));
                    --x;
                }
                else
                {
                    System.out.print(str.charAt(left));
                }                
            }
        }
    }
}
