package algorithms.dynamic_programming;

import java.util.Scanner;

public class Knapsack {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		for(int i=0;i<numTest;i++){
			int size = in.nextInt();
			int[] elements = new int[size];
			int capKnapsack = in.nextInt();
			int[] knapsack = new int[capKnapsack+1];
			for(int n=0;n<elements.length;n++)
				elements[n] = in.nextInt();
			
			for(int j=1;j<knapsack.length;j++){
				int tempMaxNum = 0;
				for(int k=0;k<elements.length;k++){
					if(elements[k] <= j)
						tempMaxNum = knapsack[j-elements[k]] + elements[k];
					if(tempMaxNum > knapsack[j])
						knapsack[j] = tempMaxNum;
				}
			}
			
			System.out.println(findMax(knapsack) );
		}
		
		
	}
	
	public static int findMax(int[] arr){
		int max = 0;
		for (int i : arr) {
			if(i>max)
				max=i;
		}
		
		return max;
	}

}
