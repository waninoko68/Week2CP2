
import java.util.Scanner;

public class P9_NumberSign {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x>0)
        {
            System.out.println("positive");
        }
        else if(x<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
