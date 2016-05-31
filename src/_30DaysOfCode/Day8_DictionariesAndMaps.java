package _30DaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		in.nextLine();
		for(int i=0;i<N;i++){
			String name=in.nextLine();
			int phone=in.nextInt();
			phoneBook.put(name, phone);
			
			in.nextLine();
		}
		while(in.hasNext()){
			String nameLookingFor = in.nextLine();
			
			if(phoneBook.containsKey(nameLookingFor))
				System.out.println(nameLookingFor + "=" + phoneBook.get(nameLookingFor));
			else
				System.out.println("Not found");
		}
		
	}

}
