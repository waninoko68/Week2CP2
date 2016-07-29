
import java.util.Scanner;

public class P11_ModAndPrint {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x%3==0)
        {
            System.out.print("3 ");
        }
        if(x%5==0)
        {
            System.out.println("5");
        }
    }
}
