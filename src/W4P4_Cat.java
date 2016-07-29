
import java.util.Scanner;

public class W4P4_Cat {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<=n;++i)
        {
            String x = scan.nextLine();
            if(i==0)
            {
                continue;
            }
            int count = 0;
            for(String y:x.split(" "))
            {
                if(y.indexOf("meow")>=0)
                {
                    if(y.length()>4)
                    {
                        for(String z:y.split("w",2))
                        {
                            if(z.indexOf("meow")>=0)
                            {
                                ++count;
                            }
                        }
                    }
                    if(y.length()==4)
                    {
                        ++count;
                    }
                }
            }
            if(count==0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}
