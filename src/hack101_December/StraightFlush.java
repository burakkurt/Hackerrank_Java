package hack101_December;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class StraightFlush {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input10.txt");
		Scanner in = new Scanner(file);
		
		String[] cardArr = new String[5];
		for(int i=0;i<5;i++){
			cardArr[i] = in.next();
		}
		
		HashSet<Character> suit = new HashSet<Character>();
		char[] cardNumbers = new char[5]; 
		for(int n=0;n<cardArr.length;n++){
			char[] charArr = cardArr[n].toCharArray();
			cardNumbers[n] = charArr[0];
			suit.add(charArr[1]);
		}
		
		if(suit.size() != 1){
			System.out.println("NO");
			return;
		}
		
		for (char c : cardNumbers) {
			System.out.println(c);
		}
		
		char equalityChecker = cardNumbers[0];
		if(equalityChecker == 'T')
			equalityChecker = 10;
		else if (equalityChecker == 'J') 
			equalityChecker = 11;
		else if (equalityChecker == 'Q') 
			equalityChecker = 12;
		else if (equalityChecker == 'K') 
			equalityChecker = 13;
		else if (equalityChecker == 'A') 
			equalityChecker = 1;
		
		System.out.println(equalityChecker);
		
	}
	
	
	public static int[] insertionSearchAsc(int[] arr){
		
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

}
