package algorithms.search;

import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        //iteration number of test cases
        for(int a=0;a<t;a++){
        	int leftSum=0;
    		int rightSum=0;
        	
        	//getting, setting size of array and putting values into the array
        	int size = in.nextInt();
        	int[] arr = new int[size];
        	for(int i=0;i<size;i++){
        		arr[i] = in.nextInt();
        		rightSum += arr[i];
        	}
        	
        	//to show correct message on the screen
        	boolean areSumsEqual = false;
        	
            //in order to make any process with previous iteration value
    		int previous = 0;
    		for(int k=0;k<arr.length;k++){
    			
				leftSum += previous;
				rightSum -= arr[k];
    			
                //assigning current index value for the next iteration
    			previous = arr[k];
    			
    			//check their equality
        		if(leftSum == rightSum){
        			areSumsEqual = true;
        			System.out.println("YES");
        			break;
        		}	
    			
    		}
            //checks for "NO"
    		if(areSumsEqual == false)
        		System.out.println("NO");
        	
        }
        
    }

}
