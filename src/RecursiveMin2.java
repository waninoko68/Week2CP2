
import java.io.*;


public class RecursiveMin2 {
    StreamTokenizer in;
    PrintWriter out;
    int min1 = Integer.MAX_VALUE;
    private int nextInt()throws IOException
    {
        in.nextToken();
        return(int) in.nval;
    }
    int min(int n)throws IOException
    {
        if(n==1)
        {
            return min1;
        }
        int x = nextInt();
        if(x<min1)
        {
            min1 = x;
        }
        return min(n-1);
    }
    void process()throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int result = min(n);
        out.println(result);
        out.close();
        
    }
    public static void main(String[] args)throws IOException
    {
        (new RecursiveMin2()).process();
    }
}
