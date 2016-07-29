
import java.io.*;


public class W8P3_RollDice {
    StreamTokenizer in;
    PrintWriter out;
    private int nextInt()throws IOException
    {
        in.nextToken();
        return(int) in.nval;
    }
    public void process()throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int x = nextInt();
        int[] a = new int[x+1];
        for(int i=1;i<=x;++i)
        {
            a[i] = nextInt();
        }
        int sum = 0;
        int count = 0;
        for(int i=1;i<=x;++i)
        {
            if(count!=0)
            {
                break;
            }
            if(sum<n)
            {
                sum+=a[i];
            }
            else if(sum>n)
            {
                sum-=a[i];
            }
            if(sum==n)
            {
                count=i;
            }
        }
        out.println(count);
        out.close();
    }

    public static void main(String[] args)throws IOException
    {
        (new W8P3_RollDice()).process();
    }
}
