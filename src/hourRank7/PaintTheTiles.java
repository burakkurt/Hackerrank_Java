package hourRank7;

import java.util.Scanner;

public class PaintTheTiles {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTiles = in.nextInt();
		String tiles = in.next();
		char[] charArr = tiles.toCharArray();
		
		char prevLetter = charArr[0];
		int numStroke = 1;
		for(int i=1;i<charArr.length;i++){
			char currLetter = charArr[i];
			if(prevLetter != currLetter){
				prevLetter = currLetter;
				numStroke++;
			}
		}
		
		System.out.println(numStroke);
	}

}
