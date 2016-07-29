
import java.util.Scanner;

public class W3P7_CharAt {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int x = scan.nextInt();
        x = x-1;
        int y = a.length();
        if(x>=y||x<0)
        {
            System.out.println("invalid position");
        }
        else
        {
            System.out.println(a.charAt(x));
        }
    }
}
