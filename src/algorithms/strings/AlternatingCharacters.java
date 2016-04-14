package algorithms.strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		for(int i=0;i<numTest;i++){
			String word = in.next();
			char[] wordChar = word.toCharArray();
			
			int numOfDel = 0;
			if(wordChar.length == 1){
				numOfDel = 0;
				break;
			}
			
			char prevLetter = wordChar[0];
			for (int n=1;n<wordChar.length;n++) {
				char currLetter = wordChar[n];
				if(prevLetter == currLetter)
					numOfDel++;
				else
					prevLetter = currLetter;
			}
			
			System.out.println(numOfDel);
		}
	}

}
