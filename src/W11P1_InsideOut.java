
import java.util.Scanner;


public class W11P1_InsideOut {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.length()%2!=0)
        {
            System.out.print(str.charAt(str.length()/2));
            for(int i=1;i<=str.length()/2;++i)
            {
                System.out.print(str.charAt(str.length()/2-i));
                System.out.print(str.charAt(str.length()/2+i));
            }
        }
        else
        {
            int x = 1;
            int y = 0;
            for(int i=0;i<str.length()/2;++i)
            {
                System.out.print(str.charAt(str.length()/2-x));
                ++x;
                System.out.print(str.charAt(str.length()/2+y));
                ++y;
            }
        }
    }    
}
