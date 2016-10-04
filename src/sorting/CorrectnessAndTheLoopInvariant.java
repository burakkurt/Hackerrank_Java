package algorithms.sorting;

import java.util.Scanner;

public class CorrectnessAndTheLoopInvariant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] intArray = new int[size];
		for (int i=0;i<intArray.length;i++)
			intArray[i] = in.nextInt();

		int tempNum;
		int currInd;
		int prevInd;
		for(int i=1;i<intArray.length;i++){
			currInd = i;
			while(currInd > 0 && intArray[currInd-1] > intArray[currInd]){
				tempNum = intArray[currInd-1];
				intArray[currInd-1] = intArray[currInd];
				intArray[currInd] = tempNum;
				 
				currInd--;
			} 
		}
		
		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}

}
