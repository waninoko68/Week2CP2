
import java.io.*;


public class W9P1_RecursiveMin {
    StreamTokenizer in;
    PrintWriter out;

    int min1 = Integer.MAX_VALUE;
    private int nextInt()throws IOException
    {
        in.nextToken();
        return(int) in.nval;
    }
    int min(int[] a,int n)
    {

        if(a[n]<min1)
        {
           min1 = a[n];
        }        
        if(n==1)
        {
           return min1; 
        }
        return min(a,n-1);
    }
    void process()throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int[] a = new int[n+1];
        for(int i=1;i<=n;++i)
        {
            a[i] = nextInt();
        }
        int x = min(a,n);
        out.println(x);
        out.close();
    }
    public static void main(String[] args)throws IOException
    {
        (new W9P1_RecursiveMin()).process();
    }
}
