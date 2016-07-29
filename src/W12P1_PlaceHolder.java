
import java.util.Scanner;


public class W12P1_PlaceHolder {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int length = str.length();
        for(int i=0;i<length;++i)
        {
            int x = str.indexOf("0",i);
            int y = str.indexOf("0",i+2);
            int z = str.indexOf("0",i+7);
            int k = str.indexOf("0",i+9);
            if(i==x)
            {
                if(y-2==x&&z-7==x&&k-9==x)
                {
                    System.out.print(str.substring(y+1,z));
                    break;
                }
            }
        }
    }
}
