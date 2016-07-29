
import java.util.Scanner;

public class W3P10_StringCut {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = a.concat(b);
        int y = 0;
        int count = 0;
        if(a.indexOf(b)<0)
        {
            System.out.println("no target character found");
        }
        else
        {
            for(int i=0;i<c.length();++i)
            {
                if(i==c.indexOf(b,i))
                {
                    System.out.println(c.substring(y,c.indexOf(b,i)));
                    y = c.indexOf(b,i)+1;
                    ++count;
                }
            }
            if(count==c.length())
            {
                System.out.println("no output");
            }
        }
        //System.out.println(count);
        //System.out.println(c.length());
        //System.out.println(a.substring(0,a.indexOf(b)));
    }
}
