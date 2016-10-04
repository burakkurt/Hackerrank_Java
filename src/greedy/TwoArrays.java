package algorithms.greedy;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwoArrays {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		//Getting number of test
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		//iterating tests
		for(int i=0;i<numTest;i++){
			//Assigning array size and the number must be sum of n th numbers of arrays equal to
			int arrSize = in.nextInt();
			int equalTo = in.nextInt();
			
			//declaring the arrays will store values
			int[] arr = new int[arrSize];
			int[] arr2 = new int[arrSize];
			
			//assigning value to arrays
			for(int k=0;k<arrSize;k++)
				arr[k] = in.nextInt();
			for(int l=0;l<arrSize;l++)
				arr2[l] = in.nextInt();
			
			//sorting first array in ascending array and sorting second array in descending order 
			//to check whether sum of n th value of both array equals to the number determined before
			int[] arrAsc = insertionSortAsc(arr);
			int[] arrDesc = insertionSortDesc(arr2);
			
			//result will be checked from this variable
			boolean isEqual = true;
			//checking equivalency for n th value of both arrays
			for(int n=0;n<arrSize;n++){
				if(arrAsc[n] + arrDesc[n] < equalTo){
					isEqual = false;
					break;
				}	
			}
			
			//printing result on the screen
			if(isEqual)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
		
		
		
	}
	
	/**
	 * Implementation of Insertion sort 
	 * @param arr is the array will be sorted
	 * @return int[] ascending sorted form of the array
	 */
	public static int[] insertionSortAsc(int[] arr){
		
		for(int i=1;i<arr.length;i++){
			int pivot = i;
			while(pivot > 0){
				if(arr[pivot] < arr[pivot-1]){
					int temp = arr[pivot];
					arr[pivot] = arr[pivot-1];
					arr[pivot-1] = temp;
				}
				pivot--;
			}
		}
		
		return arr;
		
	}
	
	/**
	 * Implementation of Insertion sort 
	 * @param arr is the array will be sorted
	 * @return int[] descending sorted form of the array
	 */
	public static int[] insertionSortDesc(int[] arr){
		
		for(int i=1;i<arr.length;i++){
			int pivot = i;
			while(pivot > 0){
				if(arr[pivot] > arr[pivot-1]){
					int temp = arr[pivot];
					arr[pivot] = arr[pivot-1];
					arr[pivot-1] = temp;
				}
				pivot--;
			}
		}
		
		return arr;
		
	}

}
