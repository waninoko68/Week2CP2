
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoException {
    public static void main(String[] args)
    {
        String filePath = "F:\\input.txt";
        try
        {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bReader = new BufferedReader(fileReader);
            for(int i=1;i<=6;++i)
            {
               System.out.println(bReader.readLine()); 
            }
            /*System.out.println(bReader.readLine());
            System.out.println(bReader.readLine());
            System.out.println(bReader.readLine());
            System.out.println(bReader.readLine());
            System.out.println(bReader.readLine());
            System.out.println(bReader.readLine());*/
        
        }
        catch(FileNotFoundException ex)
        {
            System.err.println(ex.getMessage());
        }
        catch(IOException ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
