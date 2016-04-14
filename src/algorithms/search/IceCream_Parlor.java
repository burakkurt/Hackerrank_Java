package algorithms.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class IceCream_Parlor {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		for(int t=0;t<numTest;t++){
			int money = in.nextInt();
			int numFlavor = in.nextInt();
			HashMap<Integer, Integer> flavors = new HashMap<Integer, Integer>();
			
			for(int i=1;i<=numFlavor;i++){
				int flavorCost = in.nextInt();
				int remainingMoney = money - flavorCost;
				if(flavors.containsKey(remainingMoney)){
					System.out.println(flavors.get(remainingMoney) + " " + i);
				}
				else{
					flavors.put(flavorCost, i);
				}
					
			}
			
		}
		
    }

}
