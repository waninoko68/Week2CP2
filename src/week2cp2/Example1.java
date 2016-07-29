package week2cp2;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        System.out.println("Temperature on Jan " + 20 + " = " + 29.2 + " Celcius");
        
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        double temp = scan.nextDouble();
        
        System.out.println("Temperature on Jan " + day + " = " + temp + " Celcius");
    }
    
}
