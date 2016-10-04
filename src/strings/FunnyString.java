package algorithms.strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		for(int i=0;i<numTest;i++){
			String word = in.next();
			char[] charOfWordAsc = word.toLowerCase().toCharArray();
			
			char[] charOfWordDesc = new char[charOfWordAsc.length];		
			int t=0;
			for(int n=charOfWordAsc.length-1;n>=0;n--){
				charOfWordDesc[t] = charOfWordAsc[n];
				t++;
			}
			
			boolean funny = true;
			for(int c=1;c<charOfWordAsc.length;c++){
//				System.out.println(charOfWordAsc[c] + " : " + (int)charOfWordAsc[c] + "\t" + charOfWordAsc[c-1] + " : " + (int)charOfWordAsc[c-1] + "\t" + "Difference : " + Math.abs(((int)charOfWordAsc[c] - (int)charOfWordAsc[c-1])));
//				System.out.println(charOfWordDesc[c] + " : " + (int)charOfWordDesc[c] + "\t" + charOfWordDesc[c-1] + " : " + (int)charOfWordDesc[c-1] + "\t" + "Difference : " + Math.abs(((int)charOfWordDesc[c] - (int)charOfWordDesc[c-1])));
				if(Math.abs((int)charOfWordAsc[c] - (int)charOfWordAsc[c-1]) != Math.abs((int)charOfWordDesc[c] - (int)charOfWordDesc[c-1])){
					funny = false;
				}
			}
			
			if(funny == true)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
			
		}
		
	}

}
