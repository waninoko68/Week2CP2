
import java.util.Scanner;


public class P6_SecondLast {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(((x%100)-(x%10))/10);    
    }
}
