
import java.util.Scanner;


public class W10P2_AllClosestPairs {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int[] a = new int[str.length()+1];
        int min = Integer.MAX_VALUE;
        int num = 0;
        int count = 0;
        for(int i=0;i<str.length();++i)
        {
            if(str.indexOf(str.charAt(i),i+1)!=-1)
            {
                a[i]=str.indexOf(str.charAt(i),i+1)-i;
                if(a[i]<min)
                {
                    min = a[i];
                    num = i;
                }
            }
            else
            {
                ++count;
            }
        }
        for(int i=0;i<str.length();++i)
        {
            if(a[i]==min)
            {
                System.out.print(str.charAt(i)+" ");
            }
        }
        System.out.println();
        if(count==str.length())
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(a[num]);
        }       
    }    
}
