package _30DaysOfCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class Day16_Sorting {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        int smallestDiff = Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();        
        }
        
        Arrays.sort(arr);
        
        List<Integer> numberList = new ArrayList<Integer>();
        for(int j=0;j<arr.length;j++){
        	int k = j+1;
    		int diff = Math.abs(arr[j] - arr[k]);
    		
    		if(diff < smallestDiff){
    			smallestDiff = diff;
    			
    			numberList.removeAll( (Collection<Integer>)numberList.subList(0, numberList.size()) );
    			numberList.add(arr[j]);
    			numberList.add(arr[k]);
            }
    		else if(diff == smallestDiff){
    			numberList.add(arr[j]);
    			numberList.add(arr[k]);
    		}
        	
        }
        
        Collections.sort(numberList);
        
        for(int e:numberList)
        	System.out.println(e);
        
    }

}
