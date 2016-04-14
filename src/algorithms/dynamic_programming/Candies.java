package algorithms.dynamic_programming;

import java.util.Scanner;

public class Candies {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		//Declaring and initializing grade array
		int numStd = in.nextInt();
		int[] grades = new int[numStd];
		for(int i=0;i<numStd;i++)
			grades[i] = in.nextInt();
		
		//Declaring and initializing candy arrays
		int[] candies1 = new int[numStd];
		int[] candies2 = new int[numStd];
		for(int i=0;i<candies1.length;i++){
			candies1[i] = 1;
			candies2[i] = 1;
		}
		
		disturbCandies(candies1, candies2, grades);
		int sum = calculateMaxValue(candies1, candies2);
		
		System.out.println(sum);
	}
	
	/**
	 * @param candies1 Array stores number of candies that calculated from left to right
	 * @param candies2 Array stores number of candies that calculated from right to left
	 * @param grades Array stores grade of all students
	 */
	public static void disturbCandies(int[] candies1, int[] candies2, int[] grades){
		for(int i=1;i<candies1.length;i++){
			if(grades[i-1] < grades[i])
				candies1[i] = candies1[i-1] + 1;	
			
			if(grades[grades.length-i-1] > grades[grades.length-i])
				candies2[candies2.length-i-1] = candies2[candies2.length-i] + 1;	
		}
	}
	
	/**
	 * Compares value of both candy arrays at the same index and maximum value for each index
	 * is assigned to candies1. Sum of candies1 assigned to sum variable
	 * @param candies1 Array stores number of candies that calculated from left to right
	 * @param candies2 Array stores number of candies that calculated from right to left
	 * @return int summation of maximum value from both arrays
	 */
	public static int calculateMaxValue(int[] candies1, int[] candies2){
		int sum=0;
		for(int n=0;n<candies1.length;n++){
			if(candies2[n] > candies1[n])
				candies1[n] = candies2[n];
			sum += candies1[n];
		}
		
		return sum;
	}

}
