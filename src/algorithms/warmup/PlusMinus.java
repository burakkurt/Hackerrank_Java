package algorithms.warmup;

import java.util.*;

public class PlusMinus {

	public static void main(String[] args) {
		
		//Assigning value to size variable from input
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        
        //Declaration and value assignment to array
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = in.nextInt();
        }

        //These variables will be held number of positive, negative or zero values
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        
        //Number of positive, negative or zero values will be checked
        for(int element:array){
            if(element < 0)
                countNeg++;
            else if(element > 0)
                countPos++;
            else
                countZero++;
        }
        
        //Printing rate of the plus, minus or zero numbers to total numbers
        System.out.println((double)countPos / (countPos + countNeg + countZero));
        System.out.println((double)countNeg / (countPos + countNeg + countZero));
        System.out.println((double)countZero / (countPos + countNeg + countZero));
    }

}
