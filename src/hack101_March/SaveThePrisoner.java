package hack101_March;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		for(int i=0;i<numTest;i++){
			int numPrisoners = in.nextInt();
			int numSweets = in.nextInt();
			int distrStartID = in.nextInt();
			
			int restSweets = ((numSweets-1)+(distrStartID-1)) % numPrisoners+1;
			System.out.println(restSweets);
			
		}

	}

}
