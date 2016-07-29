
import java.io.*;


public class W9P2_RecursiveMin2 extends A implements inf{
    
    void process()throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        out.println(min(n));
        out.close();
    }
    public static void main(String[] args)throws IOException
    {
        (new W9P2_RecursiveMin2()).process();
    }
}
interface inf
{
    
}
class A
{
    StreamTokenizer in;
    PrintWriter out;   
    int nextInt()throws IOException
    {
        in.nextToken();
        return(int) in.nval;
    }
    int min1 = Integer.MAX_VALUE;
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
}


