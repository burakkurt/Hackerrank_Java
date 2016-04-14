package algorithms;

import java.util.HashSet;
import java.util.Scanner;

public class CommonChild {

	//ÇÖZÜLEMEDİ
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String firstWord = in.nextLine();
		String secondWord = in.nextLine();
		
		char[] firstCharArr = firstWord.toCharArray();
		char[] secondCharArr = secondWord.toCharArray();
		
		HashSet<Character> charSet1 = new HashSet<Character>();
		for (char c : firstCharArr) 
			charSet1.add(c);
		
		HashSet<Character> charSet2 = new HashSet<Character>();
		for (char c : secondCharArr) 
			charSet2.add(c);
		
		int lengthOfStr = 0;
		for (Character character : charSet2) {
			if(charSet1.contains(character)){
				//System.out.println("charSet2 character : " + character + "\tcontains");
				lengthOfStr++;
			}
		}
			
		System.out.println(lengthOfStr);
		
	}

}
