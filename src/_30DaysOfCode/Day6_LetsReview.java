package _30DaysOfCode;

import java.util.Scanner;

public class Day6_LetsReview {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numStars = in.nextInt();
		
		for(int i=0;i<numStars;i++){
			for(int j=numStars-1;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("#");
			}
			
			System.out.println();
		}
		
	}

}
