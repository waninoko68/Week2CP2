
import java.util.Scanner;


public class Cat {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
       
        int num = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<num;++i)
        {
            String x = scan.nextLine();
            /*if(i==0)
            {
                continue;
            }*/
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
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
        }
    }
}
