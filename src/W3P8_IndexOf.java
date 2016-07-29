
import java.util.Scanner;

public class W3P8_IndexOf {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        if(a.indexOf(b)<0)
        {
            System.out.println("string not found");
        }
        else
        {
            System.out.println(a.indexOf(b)+1);
        }
    }
}
