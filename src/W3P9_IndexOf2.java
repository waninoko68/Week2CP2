
import java.util.Scanner;

public class W3P9_IndexOf2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        int x = 0;
        if(a.indexOf(b)<0)
        {
            System.out.println("string not found");
        }
        else
        {
            for(int i=0;i<a.length();++i)
            {
                if(i==a.indexOf(b,x))
                {
                    System.out.print(a.indexOf(b,x)+1+" ");
                }
                ++x;
            }
        }

    }
}
