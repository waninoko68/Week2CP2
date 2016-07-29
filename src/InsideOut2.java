
import java.util.Scanner;


public class InsideOut2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int last = str.length()-1;
        int begin = 0;
        for(int i=0;i<=str.length()/2;++i)
        {
            if(str.length()%2!=0)
            {
               if(n-i<0)
                {
                    System.out.print(str.charAt(last));
                    --last;
                }
                else if(n-i>=0&&i!=0)
                {
                    System.out.print(str.charAt(n-i));
                }           
                System.out.print(str.charAt(n+i)); 
            }
            if(str.length()%2==0)
            {
                if(i==0&&n+i<=str.length()-1)
                {
                    System.out.print(str.charAt(n));
                    continue;
                }
                if(n+i>str.length()-1)
                {
                    System.out.print(str.charAt(begin));
                    ++begin;
                    if(n-str.length()/2==n-i)
                    {
                        break;
                    }
                    System.out.print(str.charAt(n-i));
                }
                else
                {
                    System.out.print(str.charAt(n+i));
                    if(str.length()/2==i)
                    {
                        break;
                    }
                    if(n-i<0)
                    {
                        System.out.print(str.charAt(last));
                        --last;
                    }
                    else
                    {
                        System.out.print(str.charAt(n-i));
                    }                   
                }
            }
        }
    }
}
