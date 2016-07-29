import java.util.Scanner;

/**
 * Com Pro 2 Lab solution in Week 7.
 * @author Pinyo Taeprasartsit
 */
public class W7P1_Volleyball {
    Scanner scan = new Scanner(System.in);
    int k;
    Team[] teams;
    
    void input() {
        k = scan.nextInt();
        teams = new Team[k + 1];
        scan.nextLine();
        for(int i = 1; i <= k; ++i) {
            String name = scan.nextLine();
            teams[i] = new Team(name);
        }
    }
    
    void processMatch() {
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int sets = scan.nextInt();
        Team t1 = teams[n1]; // Not necessary, but help shorten later code.
        Team t2 = teams[n2]; // Not necessary, but help shorten later code.
        for(int i = 1; i <= sets; ++i) {
            int p1 = scan.nextInt();
            int p2 = scan.nextInt();
            if(p1 > p2) {
                t1.setWon += 1;
                t1.gamePoints += 1;
                t2.setLost += 1;
            } else {
                t2.setWon += 1;
                t2.gamePoints += 1;
                t1.setLost += 1;
            }
            if(i == sets) { // Winner of the last set is also a match winner.
                if(p1 > p2) t1.won += 1;
                else t2.won += 1;
            }
        }
    }
    
    void processMatches() {
        int n = k * (k - 1) / 2;
        for(int match = 1; match <= n; ++match) {
            processMatch();
        }
    }
    
    void showResults() {
        for(int i = 1; i < teams.length; ++i) {
            Team t = teams[i];
            System.out.print(t.name + " ");
            System.out.print(t.won + " ");
            System.out.print(t.gamePoints + " ");
            System.out.println((t.setWon - t.setLost));
        }
    }
    
    void process() {
        input();
        processMatches();
        showResults();
    }
    
    public static void main(String[] args) {
        (new W7P1_Volleyball()).process();
    }
}

class Team {
    String name;
    int won;
    int setWon;
    int setLost;
    int gamePoints;
    
    public Team(String name) {
        this.name = name;
        won = 0;
        setWon = 0;
        setLost = 0;
        gamePoints = 0;
    }
}