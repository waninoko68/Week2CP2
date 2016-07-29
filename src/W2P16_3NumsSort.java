
import java.util.Scanner;

public class W2P16_3NumsSort {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if(x<y&&x<z&&y<z)
        {
            System.out.println((x)+" "+(y)+" "+(z));
        }
        if(x<y&&x<z&&y>z)
        {
            System.out.println((x)+" "+(z)+" "+(y));
        }
        if(y<x&&y<z&&x<z)
        {
            System.out.println((y)+" "+(x)+" "+(z));
        }
        if(y<x&&y<z&&x>z)
        {
            System.out.println((y)+" "+(z)+" "+(x));
        }
        if(z<x&&z<y&&x<y)
        {
            System.out.println((z)+" "+(x)+" "+(y));
        }
        if(z<x&&z<y&&x>y)
        {
            System.out.println((z)+" "+(y)+" "+(x));
        }
    }
}
