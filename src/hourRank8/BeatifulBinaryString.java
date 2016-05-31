package hourRank8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeatifulBinaryString {


	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input.txt");
		Scanner in  = new Scanner(file);
		int size = in.nextInt();
		char[] charArr = in.next().toCharArray();
		
		int result=0;
		for(int i=0;i<charArr.length-2;i++){
			if(charArr[i] == '0' && charArr[i+1] == '1' && charArr[i+2] == '0'){
				System.out.println(i);
				charArr[i+2] = '1';
				result++;
			}
		}
		
		
		System.out.println(result);
	}

}
