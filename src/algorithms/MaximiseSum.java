package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximiseSum {

	//ÇÖZÜLEMEDİ
	//EDITORIAL'I AÇTIM AMA HALA ANLAMADIM. SET NEDEN KULLANILDI, DISCUSSIONDA, BALANCED TREELERI KULLANAN KİŞİLER VAR, NEDEN KULLANILDI?
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("input07.txt");
		Scanner in = new Scanner(file);
		int numTest = in.nextInt();
		
		for(int i=0;i<numTest;i++){
			int size = in.nextInt();
			int[] numberArr = new int[size];
			int mod = in.nextInt();
			
			int max = 0;
			for(int n=0;n<size;n++){
				int number = in.nextInt() % mod;
				
				int tempMax = 0;
				for(int m=0;m<n;m++){
					if(max < (number + numberArr[m]) % mod){
						max = (number + numberArr[m]) % mod;
						numberArr[n] = max;
					}
				}
				
				
			}
			
			System.out.println("Max : " + max);
		}
		
	}
	

}
