
import java.io.*;


public class W8P4_FoldBackNForth2 {
    StreamTokenizer in;
    PrintWriter out;
    int n;
    int[][] a;
    private int nextInt()throws IOException
    {
        in.nextToken();
        return(int) in.nval;
    }
    boolean Hori()
    {
        return true;
    }
    void process()throws IOException
    {
        int n = nextInt();
        int t = nextInt();
        int baseRow = 0;
        int baseCol = 0;
        
    }
    public static void main(String[] args)throws IOException
    {
        (new W8P4_FoldBackNForth2()).process();
    }
}
