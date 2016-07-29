
import java.util.Scanner;

public class P12_OperSelect {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if(z==1)
        {
            System.out.println(x+y);
        }
        if(z==2)
        {
            System.out.println(x-y);
        }
        if(z==3)
        {
            System.out.println(x*y);
        }
        if(z==4&&y==0)
        {
            System.out.println("cannot divide by zero");
        }
        if(z==4&&y!=0)
        {
            System.out.println(x/y);
        }
        if(z==5&&y==0)
        {
            System.out.println("cannot divide by zero");
        }
        if(z==5&&y!=0)
        {
            System.out.println(x%y);
        }
    }
}
