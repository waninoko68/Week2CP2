
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> aList = new ArrayList<>(5);
        aList.add(5);
        //System.out.println("Size = " + aList.size());
        aList.add(3);
        int n = scan.nextInt();
        aList.add(n);
        aList.remove(1);//remove position at "1"
        //System.out.println("Size = " + aList.size());
        //System.out.println(aList.get(0));
        //System.out.println(aList.get(1));
        //System.out.println(aList.get(2));
        for(Integer value : aList)
        {
            System.out.println(value);
        }
    }
}
