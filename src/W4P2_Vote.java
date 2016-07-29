
import java.util.Scanner;

public class W4P2_Vote {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int num = 0; 
        int[] array = new int[101];
        for(int i=0;i<k;++i)
        {
            int x = scan.nextInt();
            array[x] += 1;
        }
        for(int i=1;i<=n;++i)
        {
            if(array[i]>max)
            {
                max = array[i];
                num = i;
            }
        }
        System.out.println(num);
        System.out.println(array[num]);
    }
}
