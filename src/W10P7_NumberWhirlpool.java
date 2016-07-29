
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;


public class W10P7_NumberWhirlpool {
    StreamTokenizer in;
    PrintWriter out;
    int nextInt()throws IOException
    {
        in.nextToken();
        return(int) in.nval;
    }
    int down(int r,int c,int[][] a)
    {
        for(;;)
        {
            ++r;
            a[r][c] = (a[r-1][c]+1)%10;
            if(r==c)
            {
                break;
            }
        }
        return(r);
    }
    int left(int row,int col,int[][] a,int r,int c)
    {
        for(;;)
        {
            --col;
            a[row][col] = (a[row][col+1]+1)%10;
            if(row-col==c-r+1)
            {
                break;
            }
        }
        return(col);
    }
    int up(int row,int col,int[][] a)
    {
        for(;;)
        {
            --row;
            a[row][col] = (a[row+1][col]+1)%10;
            if(row==col)
            {
                break;
            }
        }
        return(row);
    }
    void right(int row,int col,int[][] a,int r,int c)
    {
        for(;;)
        {
            ++col;
            a[row][col] = (a[row][col-1]+1)%10;
            if(col-row==c-r+1)
            {
                break;
            }
        }
    }
    void process()throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));        
        int n = nextInt();
        int row = n/2+1;
        int col = n/2+1;
        int[][] a = new int[n+1][n+1];
        a[row][col] = 1;
        ++col;
        int r = row;
        for(int c=col;c<=n;++c)
        {
            a[r][c] = ((c-r)*(c-r)+1)%10;
            row = down(r,c,a);
            col = c;
            col = left(row,col,a,r,c);
            row = up(row,col,a);
            right(row,col,a,r,c);
            --r;
        }
        for(int i=1;i<=n;++i)
        {
            for(int j=1;j<=n;++j)
            {
                out.print(a[i][j]+" ");
            }
            out.println();
        }
        out.close();
    }
    public static void main(String[] args)throws IOException
    {
        (new W10P7_NumberWhirlpool()).process();
    }    
}
