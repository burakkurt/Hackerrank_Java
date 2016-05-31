package _30DaysOfCode;

import java.util.TreeSet;
import java.math.*;

public class Day14_AllAboutScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

//Solution is Difference class
class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	Difference(int[] e){
    elements = e;
	}
	
	public void computeDifference(){
	    int[] diffArr = new int[elements.length * elements.length];
	    int difference;
	    
	    int j=0;
	    for(int i=0;i<elements.length;i++){
	        for(int n=i+1;n<elements.length;n++){
	            difference = Math.abs(elements[i] - elements[n]);
	            if(difference > maximumDifference)
	                maximumDifference = difference;
	        }
	    }
	    
	}

}