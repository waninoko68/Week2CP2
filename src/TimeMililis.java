
import java.util.Scanner;

public class TimeMililis {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        long startTime = System.currentTimeMillis();
        System.out.println("Start Time = " + startTime);
        int x = scan.nextInt();
        int y = scan.nextInt();
        long endTime = System.currentTimeMillis();
        double time = endTime - startTime;
        System.out.format("Time = %.4f", time / 1000.0);
        int result = x+y;
        
    }
}
