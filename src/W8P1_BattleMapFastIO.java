
import java.io.*;


public class W8P1_BattleMapFastIO {
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
        int r = nextInt();
        int c = nextInt();
        int[][] a = new int[r+1][c+1];
        for(int i=1;i<=r;++i)
        {
            for(int j=1;j<=c;++j)
            {
                a[i][j] = nextInt();
            }
        }
        int k = nextInt();
        out.println(k);
        for(int i=1;i<=r;++i)
        {
            for(int j=1;j<=c;++j)
            {
                out.print(a[i][j]+" ");
            }
            out.println();
        }
        out.close();
    }
    public static void main(String[] args)throws IOException
    {
        (new W8P1_BattleMapFastIO()).process();
    }
}
