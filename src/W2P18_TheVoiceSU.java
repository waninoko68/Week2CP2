
import java.util.Scanner;

public class W2P18_TheVoiceSU {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int m = 0;
        int fm = 0;
        for(int i=1;i<=n;++i)
        {
            int sex = scan.nextInt();
            int score_m = scan.nextInt();
            int score_fm = scan.nextInt();
            if(score_m>=9&&sex==1)
            {
                if(m<k)
                {
                    System.out.println(i+" "+"1");
                    ++m;
                }
                else if(m==k&&fm<k&&score_fm>=9)
                {
                    System.out.println(i+" "+"2");
                    ++fm;
                }
            }
            else if(score_fm>=9&&sex==2)
            {
                if(fm<k)
                {
                    System.out.println(i+" "+"2");
                    ++fm;
                }
                else if(fm==k&&m<k&&score_m>=9)
                {
                    System.out.println(i+" "+"1");
                    ++m;
                }
            }
            else if(score_m>=9&&sex==2)
            {
                if(m<k)
                {
                    System.out.println(i+" "+"1");
                    ++m;
                }
                else if(m==k&&fm<k&&score_fm>=9)
                {
                    System.out.println(i+" "+"2");
                    ++fm;
                }
            }
            else if(score_fm>=9&&sex==1)
            {
                if(fm<k)
                {
                    System.out.println(i+" "+"2");
                    ++fm;
                }
                else if(fm==k&&m<k&&score_m>=9)
                {
                    System.out.println(i+" "+"1");
                    ++m;
                }
            }
        }
    }
}
