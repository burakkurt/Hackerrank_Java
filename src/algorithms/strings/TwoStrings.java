package algorithms.strings;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		
		//number of tests
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        
        //iterating tests
        for(int i=0;i<t;i++){
        	//words are assigned to variables
        	String firstWord = in.nextLine();
        	String secondWord = in.nextLine();
        	
        	//having same character will be represented in this variable
        	boolean isSame = false;
        	//iterating all characters
            for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
        			//checking existing of same character in both words
            		if(firstWord.indexOf(c) > -1 && secondWord.indexOf(c) > -1){
                        isSame = true;
                        break;
                    }
            }
    		
            //printing the result on the screen
            if(isSame == true)
            	System.out.println("YES");
            else if(isSame == false)
                System.out.println("NO");
            
    	}
        
    }
	
}
