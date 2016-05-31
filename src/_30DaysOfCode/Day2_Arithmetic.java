package _30DaysOfCode;

import java.util.Scanner;

public class Day2_Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      double tip =  ((double)T / 100) * M;
      double tax =  ((double)X / 100) * M;
      
      int total = (int) Math.round(M + tip + tax);

      System.out.println("The final price of the meal is $" + total + ".");
      
    }
    
}
