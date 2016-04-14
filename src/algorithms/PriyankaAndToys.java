package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PriyankaAndToys {

	//ÇÖZÜLEMEDİ
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input09.txt");
		Scanner in = new Scanner(file);
		int arrSize = in.nextInt();
		
		int[] arr = new int[arrSize];
		for(int i=0;i<arrSize;i++){
			arr[i] = in.nextInt();
		}
		arr = insertionSort(arr);
		printArray(arr);
		
		int maxToysBuy = 0;
		for(int j=0;j<arrSize;j++){
			int numToysBuy = 0;
//			System.out.println("arr[j] : " + arr[j]);
			for(int k=j;k<arrSize;k++){
//				System.out.println("arr[j]+4 : " + (arr[j]+4));
				if((arr[j]+4) >= arr[k] && arr[j] <= arr[k]){
//					System.out.println("if : (arr[j]+4) >= arr[k] : " + (arr[j]+4) + " " + arr[k] + "\tarr[j] <= arr[k] : " + arr[j] + " " +arr[k]);
					numToysBuy++;
				}
			}
			if(numToysBuy > maxToysBuy)
				maxToysBuy = numToysBuy;
		}
		
		System.out.println(maxToysBuy);
		
	}
	
	
	
	public static int[] insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int pivot = i;
			while(pivot > 0){
				if(arr[pivot] < arr[pivot-1]){
					int temp = arr[pivot-1];
					arr[pivot-1] = arr[pivot];
					arr[pivot] = temp;
				}
				pivot--;
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr){
		for(int n:arr)
			System.out.println(n);
	}

}
