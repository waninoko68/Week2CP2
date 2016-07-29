
import java.util.Scanner;


public class W12P2_PlaceHolder2 {
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
            int a1 = str.indexOf("0",i+1);
            int a3 = str.indexOf("0",i+3);
            int a4 = str.indexOf("0",i+4);
            int a5 = str.indexOf("0",i+5);
            int a6 = str.indexOf("0",i+6);
            int a8 = str.indexOf("0",i+8);
            if(i==x)
            {
                if(y-2==x&&z-7==x&&k-9==x&&a1-1!=x&&a3-3!=x&&a4-4!=x&&a5-5!=x&&a6-6!=x&&a8-8!=x)
                {
                    System.out.print(str.substring(y+1,z));
                    break;
                }
            }
        }
    }    
}
