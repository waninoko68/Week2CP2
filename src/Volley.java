
import java.util.Scanner;


public class Volley {
    Scanner scan = new Scanner(System.in);
    int k;
    Country[] teams;
    void input()
    {
        k = scan.nextInt();
        teams = new Country[k+1];
        scan.nextLine();
        for(int i=1;i<=k;++i)
        {
            String name = scan.nextLine();
            teams[i] = new Country(name);
        }
    }
    void processmatches()
    {
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        int set = scan.nextInt();
        for(int i=1;i<=set;++i)
        {
            int p1 = scan.nextInt();
            int p2 = scan.nextInt();
            if(p1>p2)
            {
                teams[t1].setwon+=1;
                teams[t2].setlost+=1;
            }
            else
            {
                teams[t2].setwon+=1;
                teams[t1].setlost+=1;
            }
            if(i==set)
            {
                if(p1>p2)
                {
                    teams[t1].won+=1;
                }
                else
                {
                    teams[t2].won+=1;
                }
            }
        }
    }
    void processmatch()
    {
        int n = k*(k-1)/2;
        for(int i=1;i<=n;++i)
        {
            processmatches();
        }
    }
    void showresult()
    {
        for(int i=1;i<=k;++i)
        {
            System.out.print(teams[i].name+" ");
            System.out.print(teams[i].won+" ");
            System.out.print(teams[i].setwon+" ");
            System.out.println(teams[i].setwon-teams[i].setlost);
        }
    }
    void process()
    {
        input();
        processmatch();
        showresult();
    }
    public static void main(String[] args)
    {
        (new Volley()).process();
    }
}
class Country
{
    String name;
    int won;
    int setwon;
    int setlost;
    public Country(String name)
    {
        this.name = name;
        int won=0;
        int setwon=0;
        int setlost=0;
    }
}



