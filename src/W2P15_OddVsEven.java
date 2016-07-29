
import java.util.Scanner;

public class W2P15_OddVsEven {
    public static void main(String[] args)
    {
        int sumeven=0;
        int sumodd=0;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<8;++i)
        {
            int x = scan.nextInt();
            if(x%2==0)
            {
                sumeven+=x;
            }
            else
            {
                sumodd+=x;
            }
        }
        if(sumeven>sumodd)
        {
            System.out.println("even");
        }
        if(sumeven<sumodd)
        {
            System.out.println("odd");
        }
        if(sumeven==sumodd)
        {
            System.out.println("equal");
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
    }
    
}
