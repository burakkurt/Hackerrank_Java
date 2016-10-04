package algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	public static int count = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] intArray = new int[size];
		for (int i=0;i<intArray.length;i++)
			intArray[i] = in.nextInt();
		

		int tempNum;
		int currInd;
		for(int i=1;i<intArray.length;i++){
			currInd = i;
			while(currInd > 0 && intArray[currInd-1] > intArray[currInd]){
				tempNum = intArray[currInd-1];
				intArray[currInd-1] = intArray[currInd];
				intArray[currInd] = tempNum;
				 
				currInd--;
				count++;
			} 
		}
		System.out.println(count);

	}

}
