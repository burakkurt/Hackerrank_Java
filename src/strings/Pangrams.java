package algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		
		//Getting the sentence to string variable 
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		
		//Having number of characters will be checked from this set
		HashSet<Character> characterSet = new HashSet<Character>();
		
		//string sentence gets converted to char array
		char[] charArr = sentence.toLowerCase().toCharArray();
		
		//iterating all characters and adding them to set
		for(char c:charArr){
			if(c == ' ' || c == '?' || c == '!' || c == ',' || c == '.')
				continue;
			else
				characterSet.add(c);
		}	
		
		//checking whether set has all all characters and printing the result
		if(characterSet.size() == 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		
	}

}
