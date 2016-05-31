package _30DaysOfCode;

import java.util.Scanner;

public class Day11_2DArraysMoreReview {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int bigger = -64;
        for(int j=0;j<4;j++){
            int sum = 0;
        	for(int k=0;k<4;k++){
        		sum = arr[j][k] + arr[j][k+1] + arr[j][k+2] + arr[j+1][k+1] + arr[j+2][k] + arr[j+2][k+1] 
                    + arr[j+2][k+2];
                
                if(bigger < sum)
                    bigger = sum;
        	}
        	
        }
        
        System.out.println(bigger);
    }

}
