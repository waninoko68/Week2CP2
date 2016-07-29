
import java.util.Scanner;


public class W5P4_WordsOf3Powers {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int end = 0;
        for(int i=1; ;++i)
        {
            String x = scan.nextLine();
            if(count1>=1&&count2>=1&&count3>=1)
            {
                break;
            }
            if(x.indexOf("Dana")>=0&&num1==0)
            {
                num1=i;
                ++count1;
            }
            if(x.indexOf("Sila")>=0&&num2==0)
            {
                num2=i;
                ++count2;
            }
            if(x.indexOf("Bhavana")>=0&&num3==0)
            {
                num3=i;
                ++count3;
            }
            end=i;
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(end);
    }
}
