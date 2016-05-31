package _30DaysOfCode;

import java.util.Scanner;

public class Day5_Loops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		for(int i=0;i<numTest;i++){
			
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			for(int j=0;j<n;j++){
				int result = 0;
				for(int k=0;k<=j;k++){
					//System.out.print(k);
					result += (int)Math.pow(2, k) * b;
					//System.out.print(result + " ");
				}
				System.out.print(a + result + " ");
			}
			System.out.println();
			
		}

	}

}
