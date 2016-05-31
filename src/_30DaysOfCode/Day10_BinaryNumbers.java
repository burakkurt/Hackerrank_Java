package _30DaysOfCode;

import java.util.Scanner;

public class Day10_BinaryNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		String result = "";
		for(int i=0;i<numTest;i++){
			int number = in.nextInt();
			
			while(number >= 2){
				result +=  number % 2;
				number = number / 2;
			}
			result += number;
			
			char[] resultCharArr = result.toCharArray();
			for(int n=resultCharArr.length-1;n>=0;n--)
				System.out.print(resultCharArr[n]);
			
			System.out.println();
			result = "";
		}
		
	}

}
