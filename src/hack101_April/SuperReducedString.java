package hack101_April;

import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		char[] charArr = word.toCharArray();
		
		char prevLetter;
		char currLetter;
		for(int i=1;i<charArr.length;i++){
			prevLetter = charArr[i-1];
			currLetter = charArr[i];
			
			if(prevLetter == currLetter){
				charArr[i-1] = '0';
				charArr[i] = '0';
			}
			
		}
		
		for (char c : charArr) {
			if(c != '0')
				System.out.print(c);
		}
		
		
	}

}
