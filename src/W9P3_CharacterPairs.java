
import java.io.*;


public class W9P3_CharacterPairs {
    StreamTokenizer in;
    PrintWriter out;
    int sum = 0;
    int count = 0;
    private String next()throws IOException
    {
        in.nextToken();
        return(String) in.sval;
    }        
    int countPairs(String str)
    {
        int d = str.length();
        if(count==d-1||count+2>d-1)
        {
            return sum;
        }
        char y = str.charAt(count);
        char z = str.charAt(count+2);
        if(y==z)
        {
            ++sum;
        }
        ++count;
        return countPairs(str);
    }
    void process()throws IOException
    {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String x = next();
        int num = countPairs(x);
        out.println(num);
        out.close();
    }
    public static void main(String[] args)throws IOException
    {
        (new W9P3_CharacterPairs()).process();
    }
}
