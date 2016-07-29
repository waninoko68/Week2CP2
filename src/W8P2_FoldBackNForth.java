
import java.io.*;


public class W8P2_FoldBackNForth {        
    StreamTokenizer in;
    PrintWriter out; 
    int n;
    int[][] a;
    private int nextInt()throws IOException
    {
        in.nextToken();
        return(int) in.nval;
    }
    int foldHorizontal(int row,int col,int val)
    {
        for(int c=col;c<n;++c)
        {
            if(val>9)
            {
                val=0;
            }
           a[row][c]=val;
           ++val;
        }
        ++row;
        for(int c=n-1;c>=col;--c)
        {
            if(val>9)
            {
                val=0;
            }
            a[row][c]=val;
            ++val;
        }
        return val;
    }
    int foldVertical(int row,int col,int val)
    {
        for(int r=row;r<n;++r)
        {
            if(val>9)
            {
                val=0;
            }
            a[r][col]=val;
            ++val;
        }
        ++col;
        for(int r=n-1;r>=row;--r)
        {
            if(val>9)
            {
                val=0;
            }
            a[r][col]=val;
            ++val;
        }
        return val;
    }
    public void process()throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        n = nextInt();
        int row = 0;
        int col = 0;
        int val = 1;
        a = new int[n+1][n+1];
        while(row<n&&col<n)
        {
           val = foldHorizontal(row,col,val); 
           row+=2;
           val = foldVertical(row,col,val);
           col+=2;
        }
        print();
    }
    void print()
    {
        for(int r=0;r<n;++r)
        {
            for(int c=0;c<n;++c)
            {
                /*if(a[r][c]==-1)
                {
                    out.write(" ");
                }*/
                //else
                //{
                    out.print(a[r][c]+" "); 
                //}                
            }
            out.println();
        }
        out.close();
    }
    public static void main(String[] args)throws IOException
    {
        (new W8P2_FoldBackNForth()).process();
    }
}
