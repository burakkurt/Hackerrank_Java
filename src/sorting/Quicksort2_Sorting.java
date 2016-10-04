package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort2_Sorting {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++)
            numbers[i] = in.nextInt();

        quickSort(numbers, 0, numbers.length-1);
	
	}
	
	public static void quickSort(int[] numArr, int l, int r){
		if(l>=r)
			return;
		
		int m = partition(numArr, l, r);
		
		quickSort(numArr, l, m-1);
		quickSort(numArr, m+1, r);
		
		if(isArraySorted(numArr, l, r)){
			for (int i=l;i<=r;i++)
				System.out.print(numArr[i] + " ");
			System.out.println();	
		}
	}
	
	public static int partition(int[] numArr, int l, int r){
		int pivot = numArr[l];
		List<Integer> leftList = new ArrayList<Integer>();
		List<Integer> rightList = new ArrayList<Integer>();
		
		for(int i=l+1;i<=r;i++){
			if(numArr[i] < pivot)
				leftList.add(numArr[i]);
			else if(numArr[i] > pivot)
				rightList.add(numArr[i]);
		}
		
		copyValues(numArr, l, leftList, rightList);
        
		return l+leftList.size();
	}
	
	public static void copyValues(int[] numArr, int l, List<Integer> leftList, List<Integer> rightList){
		int pivot = numArr[l];
		for (int i=0;i<leftList.size();i++) 
			numArr[l+i] = leftList.get(i);
		numArr[l+leftList.size()] = pivot;
		for (int i=0;i<rightList.size();i++) 
			numArr[l+i+leftList.size()+1] = rightList.get(i);
	}
	
	public static boolean isArraySorted(int[] numArr, int l, int r){
		boolean sorted = true;
		for(int i=l+1;i<=r;i++){
			if(numArr[i-1] > numArr[i]){
				sorted = false;
				break;
			}
		}
		
		return sorted;
	}
 
}
