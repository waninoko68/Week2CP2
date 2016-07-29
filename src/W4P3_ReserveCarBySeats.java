
import java.util.Scanner;

public class W4P3_ReserveCarBySeats {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k =scan.nextInt();
        int[] max_seat = new int[101];
        int[] seat = new int[101];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=k;++i)
        {
            int x = scan.nextInt();
            max_seat[i]=x;
            if(x>max)
            {
                max=x;
            }
        }
        for(int i=1;i<=n;++i)
        {
            int num = 0;
            int min = Integer.MAX_VALUE;
            int s = scan.nextInt();
            int d = scan.nextInt();
            if(s>max)
            {
                System.out.println("sorry");
            }
            else
            {
                for(int j=1;j<=k;++j)
                {
                    if(max_seat[j]-s<=min&&max_seat[j]>=s)
                    {
                        if(min==max_seat[j]-s)
                        {
                            if(seat[num]>seat[j])
                            {
                                min=max_seat[j]-s;
                                num = j;
                            }
                        }
                        else
                        {
                            min=max_seat[j]-s;
                            num = j;
                        }
                    }
                }
                System.out.println(num);
                seat[num]+=d;
            }
        }
    }
}
